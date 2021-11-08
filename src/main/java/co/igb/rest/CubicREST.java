package co.igb.rest;

import co.igb.apiCubic.dto.orden.CubicOrdenDTO;
import co.igb.apiCubic.ejb.CubicOrdenEJB;
import co.igb.persistence.facade.InvoiceFacade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("cubic")
public class CubicREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(CubicREST.class.getSimpleName());

    @EJB
    private CubicOrdenEJB cubicOrdenEJB;
    @EJB
    private InvoiceFacade invoiceFacade;

    @GET
    @Path("add-order/{docnum}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createOrder(@PathParam("docnum") String docNum,
                                @HeaderParam("X-Company-Name") String companyName,
                                @HeaderParam("X-Employee") String userName,
                                @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando creacion de orden en el operador logistico Link para {0}", companyName);

        CubicOrdenDTO.OrdenTrabajo.Encabezado.Operacion operacion = new CubicOrdenDTO.OrdenTrabajo.Encabezado.Operacion();
        operacion.setCodAgencia("100");
        operacion.setNumDeposito("1");

        CubicOrdenDTO.OrdenTrabajo.Encabezado encabezado = new CubicOrdenDTO.OrdenTrabajo.Encabezado();
        encabezado.setNumDocumento(docNum);
        encabezado.setTipoDocumento("1");
        encabezado.setTipoMovimiento("1");
        encabezado.setCodConcepto("2");
        encabezado.setOperacion(operacion);

        List<Object[]> details = invoiceFacade.listDetailInvoice(docNum, companyName, pruebas);

        List<CubicOrdenDTO.OrdenTrabajo.item> items = new ArrayList<>();
        for (Object[] obj : details) {
            CubicOrdenDTO.OrdenTrabajo.item.Referencia referencia = new CubicOrdenDTO.OrdenTrabajo.item.Referencia();
            referencia.setRefPrincipal((String) obj[0]);
            referencia.setDescripcion((String) obj[1]);
            referencia.setValUnitario((BigDecimal) obj[3]);
            referencia.setCodTipoProducto("1");
            referencia.setCodUnidadMedida("1");
            referencia.setCodPresentacion("1");
            referencia.setCodProcedencia("1");

            CubicOrdenDTO.OrdenTrabajo.item item = new CubicOrdenDTO.OrdenTrabajo.item();
            item.setNumItem((long) items.size());
            item.setReferencia(referencia);
            item.setCantidad((Integer) obj[2]);
            items.add(item);
        }

        CubicOrdenDTO dto = new CubicOrdenDTO();
        dto.setNit(899153615);
        dto.setUsuario("pruebas");
        dto.setLlave("48ebca3f8115b3c33270f140e4453770");

        CubicOrdenDTO.OrdenTrabajo ordenTrabajo = new CubicOrdenDTO.OrdenTrabajo();
        ordenTrabajo.setEncabezado(encabezado);
        ordenTrabajo.setItems(items);

        dto.setOrdenTrabajo(ordenTrabajo);

        return Response.ok(cubicOrdenEJB.addOrden(dto)).build();
    }
}