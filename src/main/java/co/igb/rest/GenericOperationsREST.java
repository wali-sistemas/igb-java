package co.igb.rest;

import co.igb.dto.ResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.ejb.JournalEntryEJB;
import co.igb.hanaws.dto.journalEntries.JournalEntryDTO;
import co.igb.persistence.facade.TranspFacade;
import co.igb.persistence.facade.WarehouseFacade;
import co.igb.transportws.ejb.RapidoochoaEJB;

import javax.ejb.*;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
@Path("generic")
public class GenericOperationsREST {
    private static final Logger CONSOLE = Logger.getLogger(GenericOperationsREST.class.getSimpleName());

    @Inject
    private IGBApplicationBean applicationBean;
    @EJB
    private WarehouseFacade warehouseFacade;
    @EJB
    private JournalEntryEJB journalEntryEJB;
    @EJB
    private TranspFacade transpFacade;
    @EJB
    private RapidoochoaEJB rapidoochoaEJB;

    @GET
    @Path("companies")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response listCompanies() {
        CONSOLE.log(Level.INFO, "Listando empresas disponibles para login");
        return Response.ok(applicationBean.listCompanies()).build();
    }

    @GET
    @Path("status")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response getStatus() {
        return Response.ok(new ResponseDTO(0, null)).build();
    }

    @GET
    @Path("warehouses")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response listWarehouses(@HeaderParam("X-Company-Name") String companyName,
                                   @HeaderParam("X-Pruebas") boolean pruebas) {
        return Response.ok(new ResponseDTO(0, warehouseFacade.listBinEnabledWarehouses(companyName, pruebas))).build();
    }

    @POST
    @Path("add-journalEntry")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response createJournalEntry(JournalEntryDTO dto) {
        CONSOLE.log(Level.INFO, "Iniciando servicio de creacion de asiento de nomina en SAP para la empresa {0}");
        return Response.ok(journalEntryEJB.createJournalEntry(dto, "VARROCPruebas")).build();
    }

    @GET
    @Path("companies/transports")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listTransportsActive(@HeaderParam("X-Company-Name") String companyName,
                                         @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando transportadoras activas");
        return Response.ok(transpFacade.listTranspActive(companyName, pruebas)).build();
    }

    @GET
    @Path("companies/transports-comex")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listTransportsComexActive(@HeaderParam("X-Company-Name") String companyName,
                                              @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando transportadoras activas para comex");
        return Response.ok(transpFacade.listTranspComexActive(companyName, pruebas)).build();
    }
}