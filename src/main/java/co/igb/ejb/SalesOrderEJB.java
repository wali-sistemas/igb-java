package co.igb.ejb;

import co.igb.b1ws.client.order.Document;
import co.igb.b1ws.client.order.DocumentParams;
import co.igb.b1ws.client.order.GetByParams;
import co.igb.b1ws.client.order.GetByParamsResponse;
import co.igb.b1ws.client.order.MsgHeader;
import co.igb.b1ws.client.order.OrdersService;
import co.igb.b1ws.client.order.Update;
import co.igb.b1ws.client.order.UpdateResponse;
import co.igb.rest.BasicSAPFunctions;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class SalesOrderEJB {
    private static final Logger CONSOLE = Logger.getLogger(SalesOrderEJB.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;
    @EJB
    private BasicSAPFunctions sapFunctions;

    private Document retrieveOrderDocument(Long docEntry, String sessionId) throws MalformedURLException {
        OrdersService service = new OrdersService(
                new URL(String.format(
                        appBean.obtenerValorPropiedad(Constants.B1WS_WSDL_URL),
                        Constants.B1WS_ORDERS_SERVICE)));

        MsgHeader header = new MsgHeader();
        header.setServiceName(Constants.B1WS_ORDERS_SERVICE);
        header.setSessionID(sessionId);

        DocumentParams docParams = new DocumentParams();
        docParams.setDocEntry(docEntry);

        GetByParams params = new GetByParams();
        params.setDocumentParams(docParams);

        GetByParamsResponse response = service.getOrdersServiceSoap12().getByParams(params, header);
        return response.getDocument();
    }

    public boolean closeOrderLines(String companyName, Integer orderEntry, HashSet<String> items) {
        //1. Login
        String sessionId = getSessionId(companyName);

        //2. Procesar documento
        boolean success = false;
        if (sessionId != null) {
            try {
                Document doc = retrieveOrderDocument(orderEntry.longValue(), sessionId);
                List<Document.DocumentLines.DocumentLine> lines = doc.getDocumentLines().getDocumentLine();
                for (Document.DocumentLines.DocumentLine line : lines) {
                    if (items.contains(line.getItemCode())) {
                        line.setLineStatus("C");
                    }
                }
                success = modifyOrderDocument(doc, sessionId);
                if (success) {
                    CONSOLE.log(Level.INFO, "Se modifico la orden satisfactoriamente");
                } else {
                    CONSOLE.log(Level.WARNING, "Ocurrió un problema al modificar la orden");
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar lineas en la orden. ", e);
            }
        }

        //3. Logout
        if (sessionId != null) {
            sapFunctions.logout(sessionId);
        }
        return success;
    }

    public boolean modifySalesOrderQuantity(String companyName, Integer orderEntry, String itemCode, Integer newQuantity) {
        boolean success = false;
        //1. Login
        String sessionId = getSessionId(companyName);

        //2. Procesar documento
        if (sessionId != null) {
            try {
                Document doc = retrieveOrderDocument(orderEntry.longValue(), sessionId);
                List<Document.DocumentLines.DocumentLine> lines = doc.getDocumentLines().getDocumentLine();
                for (Document.DocumentLines.DocumentLine line : lines) {
                    if (line.getItemCode().equals(itemCode)) {
                        line.setQuantity(newQuantity.doubleValue());
                        break;
                    }
                }
                success = modifyOrderDocument(doc, sessionId);
                if (success) {
                    CONSOLE.log(Level.INFO, "Se modifico la orden satisfactoriamente");
                } else {
                    CONSOLE.log(Level.WARNING, "Ocurrió un problema al modificar la orden");
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al modificar la cantidad de la orden. ", e);
            }
        }

        //3. Logout
        if (sessionId != null) {
            sapFunctions.logout(sessionId);
        }
        return success;
    }

    private String getSessionId(String companyName) {
        String sessionId = null;
        try {
            sessionId = sapFunctions.login(companyName);
            CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
        } catch (Exception ignored) {
        }
        return sessionId;
    }

    private boolean modifyOrderDocument(Document document, String sessionId) throws MalformedURLException {
        OrdersService service = new OrdersService(
                new URL(String.format(
                        appBean.obtenerValorPropiedad(Constants.B1WS_WSDL_URL),
                        Constants.B1WS_ORDERS_SERVICE)));

        MsgHeader header = new MsgHeader();
        header.setServiceName(Constants.B1WS_ORDERS_SERVICE);
        header.setSessionID(sessionId);

        Update params = new Update();
        params.setDocument(document);

        try {
            UpdateResponse resp = service.getOrdersServiceSoap12().update(params, header);
            if (resp != null) {
                return true;
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al modificar la cantidad de la orden. ", e);
        }
        return false;
    }
}
