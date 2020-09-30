package co.igb.ejb;

import co.igb.b1ws.client.order.*;
import co.igb.dto.ResponseDTO;
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

/**
 * @author jguisao
 */
@Stateless
public class SalesOrderEJB {
    private static final Logger CONSOLE = Logger.getLogger(SalesOrderEJB.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;
    @EJB
    private BasicSAPFunctions sapFunctions;

    private Document retrieveOrderDocument(Long docEntry, String sessionId) throws MalformedURLException {
        OrdersService service = new OrdersService(new URL(String.format(appBean.obtenerValorPropiedad(Constants.B1WS_WSDL_URL), Constants.B1WS_ORDERS_SERVICE)));

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

    public ResponseDTO closeOrderLines(String companyName, Integer orderEntry, HashSet<String> items) {
        ResponseDTO res = null;
        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.getSessionId(companyName);
            if (sessionId != null) {
                CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al iniciar sesion en el DI Server.");
                return new ResponseDTO(-1, "Ocurrio un error al iniciar sesion en el DI Server.");
            }
        } catch (Exception ignored) {
        }
        //2. Procesar documento
        if (sessionId != null) {
            try {
                Document doc = retrieveOrderDocument(orderEntry.longValue(), sessionId);
                List<Document.DocumentLines.DocumentLine> lines = doc.getDocumentLines().getDocumentLine();
                for (Document.DocumentLines.DocumentLine line : lines) {
                    if (items.contains(line.getItemCode())) {
                        line.setLineStatus("C");
                    }
                }
                res = modifyOrderDocument(doc, sessionId);
                if (res.getCode() == 0) {
                    CONSOLE.log(Level.INFO, "Se cerraron lineas de la orden satisfactoriamente");
                } else {
                    CONSOLE.log(Level.WARNING, "Ocurrio un problema al cerrar lineas de la orden");
                    return new ResponseDTO(-1, res.getContent());
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar lineas en la orden. ", e);
            }
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
        return new ResponseDTO(0, res.getContent());
    }

    public ResponseDTO modifySalesOrderQuantity(String companyName, Integer orderEntry, String itemCode, Integer newQuantity) {
        ResponseDTO res = null;
        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.getSessionId(companyName);
            if (sessionId != null) {
                CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al iniciar sesion en el DI Server.");
                return new ResponseDTO(-1, "Ocurrio un error al iniciar sesion en el DI Server.");
            }
        } catch (Exception ignored) {
        }
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
                res = modifyOrderDocument(doc, sessionId);
                if (res.getCode() == 0) {
                    CONSOLE.log(Level.INFO, "Se modifico la orden satisfactoriamente");
                } else {
                    CONSOLE.log(Level.WARNING, "Ocurrió un problema al modificar la orden " + res.getContent() + ". Resetear el sesión ID.");
                    return new ResponseDTO(-1, res.getContent());
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al modificar la cantidad de la orden. ", e);
                return new ResponseDTO(-1, e);
            }
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
        return new ResponseDTO(0, res.getContent());
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

    private ResponseDTO modifyOrderDocument(Document document, String sessionId) throws MalformedURLException {
        String errorMessage = null;
        OrdersService service = new OrdersService(new URL(String.format(appBean.obtenerValorPropiedad(Constants.B1WS_WSDL_URL), Constants.B1WS_ORDERS_SERVICE)));

        MsgHeader header = new MsgHeader();
        header.setServiceName(Constants.B1WS_ORDERS_SERVICE);
        header.setSessionID(sessionId);

        Update params = new Update();
        params.setDocument(document);

        CONSOLE.log(Level.INFO, "Modificando orden de venta en SAP con sessionId [{0}]", sessionId);

        try {
            UpdateResponse resp = service.getOrdersServiceSoap12().update(params, header);
            if (resp != null) {
                return new ResponseDTO(0, resp);
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al modificar la cantidad de la orden. ", e);
            errorMessage = e.getMessage();
        }
        return new ResponseDTO(-1, errorMessage);
    }
}