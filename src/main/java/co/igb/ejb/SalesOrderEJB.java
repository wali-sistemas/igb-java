package co.igb.ejb;

import co.igb.dto.ResponseDTO;
import co.igb.hanaws.client.order.OrderClient;
import co.igb.hanaws.dto.order.DetailDTO;
import co.igb.rest.BasicSAPFunctions;
import co.igb.util.Constants;
import com.google.gson.Gson;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class SalesOrderEJB {
    private static final Logger CONSOLE = Logger.getLogger(SalesOrderEJB.class.getSimpleName());
    private OrderClient service;
    @Inject
    private IGBApplicationBean appBean;
    @EJB
    private BasicSAPFunctions sapFunctions;

    @PostConstruct
    private void initialize() {
        try {
            service = new OrderClient(Constants.HANAWS_SL_URL);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la instancia de OrdersServiceLayer. ", e);
        }
    }

    public ResponseDTO modifySalesOrderQuantity(String companyName, Integer orderEntry, Long lineNum, Integer newQuantity) {
        Long res = null;
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
                DetailDTO order = new DetailDTO();
                List<DetailDTO.DocumentLines.DocumentLine> lines = new ArrayList<>();
                DetailDTO.DocumentLines.DocumentLine detail = new DetailDTO.DocumentLines.DocumentLine();
                detail.setLineNum(lineNum);
                detail.setQuantity(newQuantity.doubleValue());
                lines.add(detail);

                order.setDocumentLines(lines);

                res = modifyOrderDocument(order, sessionId, orderEntry);
                if (res > 0) {
                    CONSOLE.log(Level.INFO, "Se modifico la orden satisfactoriamente.");
                } else {
                    CONSOLE.log(Level.WARNING, "Ocurrió un problema al modificar la orden docEntry=" + res + ". Resetear el sesión ID.");
                    return new ResponseDTO(-1, "Ocurrio un problema al modificar la orden docEntry=" + res + ". Intentelo nuevamente.");
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al modificar la cantidad de la orden.", e);
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
        return new ResponseDTO(0, res);
    }

    private Long modifyOrderDocument(DetailDTO document, String sessionId, Integer docEntry) {
        try {
            Gson gson = new Gson();
            String JSON = gson.toJson(document);
            CONSOLE.log(Level.INFO, JSON);
            service.updateOrder(document, sessionId, docEntry);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error retornando la respuesta de la actualizacion de la orden DocEntry=" + docEntry, e.getMessage());
            return -1l;
        }
        return docEntry.longValue();
    }
}