package co.igb.rest;

import co.igb.dto.ResponseDTO;
import co.igb.dto.ShipingDTO;
import co.igb.persistence.facade.InvoiceFacade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("shiping")
public class ShipingREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(ShipingREST.class.getSimpleName());

    @EJB
    private InvoiceFacade invoiceFacade;

    @GET
    @Path("invoices")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response findInvoincesShiping(@HeaderParam("X-Company-Name") String companyName,
                                         @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                         @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando facturas para realizar shiping de la empresa [" + companyName + "]");
        List<Object[]> listInvoices = invoiceFacade.findListInvoincesShiping(companyName, pruebas);
        List<ShipingDTO> shiping = new ArrayList<>();

        if (listInvoices == null) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron facturas pendientes para shiping.")).build();
        }

        for (Object[] row : listInvoices) {
            ShipingDTO dto = new ShipingDTO();
            dto.setDocDate((Date) row[0]);
            dto.setBox((Integer) row[1]);
            dto.setDocNum((String) row[2]);
            dto.setCardCode((String) row[3]);
            dto.setCardName((String) row[4]);
            dto.setTransport((String) row[5]);
            dto.setStreet((String) row[6]);
            dto.setDepart((String) row[7]);
            dto.setCity((String) row[8]);

            shiping.add(dto);
        }
        return Response.ok(new ResponseDTO(0, shiping)).build();
    }
}