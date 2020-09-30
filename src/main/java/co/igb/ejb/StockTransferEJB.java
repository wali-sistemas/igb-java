package co.igb.ejb;

import co.igb.b1ws.client.stocktransfer.Add;
import co.igb.b1ws.client.stocktransfer.AddResponse;
import co.igb.b1ws.client.stocktransfer.MsgHeader;
import co.igb.b1ws.client.stocktransfer.StockTransfer;
import co.igb.b1ws.client.stocktransfer.StockTransferService;
import co.igb.exception.SAPSessionException;
import co.igb.exception.WaliRuntimeException;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.PickingRecord;
import co.igb.persistence.facade.AssignedOrderFacade;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.PickingRecordFacade;
import co.igb.rest.BasicSAPFunctions;
import co.igb.util.Constants;
import co.igb.util.IGBUtils;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class StockTransferEJB {
    private static final Logger CONSOLE = Logger.getLogger(IGBAuthLDAP.class.getSimpleName());
    @Inject
    private IGBApplicationBean appBean;
    @EJB
    private BasicSAPFunctions sapFunctions;
    @EJB
    private BinLocationFacade blFacade;
    @EJB
    private AssignedOrderFacade aoFacade;
    @EJB
    private PickingRecordFacade prFacade;

    public void transferClosedPickingToPackingArea(Integer orderNumber, String companyName, boolean pruebas) {
        //1. validar que la orden se encuentre cerrada
        AssignedOrder assignedOrder = aoFacade.findByOrderNumber(orderNumber, companyName, pruebas);
        if (assignedOrder == null) {
            throw new WaliRuntimeException("No se encontró la orden de venta");
        }
        if (!assignedOrder.getStatus().equals(Constants.STATUS_CLOSED)) {
            throw new WaliRuntimeException("La orden " + orderNumber + " no se encuentra cerrada, por lo tanto no puede ser descargada a ubicación de packing");
        }
        //2. obtener picking records para la orden
        List<PickingRecord> pickedItems = prFacade.listPicking(orderNumber, companyName, pruebas);
        //3. recorrer cada registro, agregando lineas al traslado
        StockTransfer document = new StockTransfer();
        document.setSeries(Long.parseLong(getPropertyValue(Constants.STOCK_TRANSFER_SERIES, companyName)));
        StockTransfer.StockTransferLines documentLines = new StockTransfer.StockTransferLines();
        long packingBinAbs = 0L;
        long lineNum = 0L;
        for (PickingRecord record : pickedItems) {
            //Si no se ha configurado el almacen de origen y destino, lo hace
            if (document.getToWarehouse() == null) {
                String whsCode = blFacade.getBinWarehouse(record.getBinFrom(), companyName, pruebas);
                if (whsCode == null) {
                    throw new WaliRuntimeException("Ocurrió un error al consultar el almacén para la ubicación con binabs=" + record.getBinFrom());
                }
                if (packingBinAbs == 0) {
                    packingBinAbs = blFacade.findPackingLocation(whsCode, companyName, pruebas);
                }

                document.setToWarehouse(whsCode);
                document.setFromWarehouse(whsCode);
                document.setComments("Traslado de picking completo a posicion de packing generado desde Wali por " + assignedOrder.getEmpId());
            }

            StockTransfer.StockTransferLines.StockTransferLine line = new StockTransfer.StockTransferLines.StockTransferLine();
            line.setLineNum(lineNum++);
            line.setItemCode(record.getItemCode());
            line.setQuantity(record.getQuantity().doubleValue());
            line.setWarehouseCode(document.getToWarehouse());
            line.setFromWarehouseCode(document.getToWarehouse());

            StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation outOperation =
                    new StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation();
            outOperation.setAllowNegativeQuantity("tNO");
            outOperation.setBaseLineNumber(line.getLineNum());
            outOperation.setBinAbsEntry(record.getBinTo());
            outOperation.setBinActionType("batFromWarehouse");
            outOperation.setQuantity(record.getQuantity().doubleValue());

            StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation inOperation =
                    new StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation();
            inOperation.setAllowNegativeQuantity("tNO");
            inOperation.setBaseLineNumber(line.getLineNum());
            inOperation.setBinAbsEntry(packingBinAbs);
            inOperation.setBinActionType("batToWarehouse");
            inOperation.setQuantity(record.getQuantity().doubleValue());

            StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations binAllocations = new StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations();
            binAllocations.getStockTransferLinesBinAllocation().add(inOperation);
            binAllocations.getStockTransferLinesBinAllocation().add(outOperation);

            line.setStockTransferLinesBinAllocations(binAllocations);
            documentLines.getStockTransferLine().add(line);
        }
        document.setStockTransferLines(documentLines);
        //4. crear documento en sap
        processSAPTransaction(document, companyName);
    }

    private void processSAPTransaction(StockTransfer document, String companyName) {
        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.getSessionId(companyName);
            if (sessionId != null) {
                CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al iniciar sesion en el DI Server.");
            }
        } catch (Exception ignored) {
        }
        //2. Registrar documento
        long docEntry = -1L;
        if (sessionId != null) {
            try {
                docEntry = createTransferDocument(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la transferencia docEntry={0}", docEntry);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el documento. ", e);
                throw new WaliRuntimeException("Ocurrió un error al crear la transferencia. ", e);
            }
        } else {
            throw new SAPSessionException("Ocurrió un error al iniciar sesión en SAPB1");
        }
        //3. Logout
        if (sessionId != null) {
            boolean resp = sapFunctions.returnSession(sessionId);
            if (resp) {
                CONSOLE.log(Level.INFO, "Se cerro la sesion [{0}] de DI Server correctamente", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la sesion [{0}] de DI Server", sessionId);
            }
        }
        //4. Validar y retornar
        if (docEntry <= 0) {
            throw new WaliRuntimeException("Ocurrió un error al crear la transferencia. ");
        }
    }

    private Long createTransferDocument(StockTransfer document, String sessionId) throws MalformedURLException {
        StockTransferService service = new StockTransferService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "StockTransferService")));
        Add add = new Add();
        add.setStockTransfer(document);

        MsgHeader header = new MsgHeader();
        header.setServiceName("StockTransferService");
        header.setSessionID(sessionId);

        CONSOLE.log(Level.INFO, "Creando traslado en SAP con sessionId [{0}]", sessionId);

        AddResponse response = service.getStockTransferServiceSoap12().add(add, header);
        return response.getStockTransferParams().getDocEntry();
    }

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }
}