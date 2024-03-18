package co.igb.rest;

import co.igb.dto.CityDTO;
import co.igb.persistence.facade.BusinessPartnerFacade;
import co.igb.persistence.facade.CityFacade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("businesspartners")
public class BusinessPartnersREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(BusinessPartnersREST.class.getSimpleName());
    @EJB
    private BusinessPartnerFacade businessPartnerFacade;
    @EJB
    private CityFacade cityFacade;

    @GET
    @Path("sales-person")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getSalesPersonActives(@QueryParam("email") String email,
                                          @HeaderParam("X-Company-Name") String companyName,
                                          @HeaderParam("X-Pruebas") boolean pruebas) {
        return Response.ok(businessPartnerFacade.listSalesPersonActives(companyName, email, pruebas)).build();
    }

    @GET
    @Path("municipios")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getMunicipios(@HeaderParam("X-Company-Name") String companyName,
                                  @HeaderParam("X-Pruebas") boolean pruebas) {
        List<Object[]> objects = cityFacade.listMunicipios(companyName, false);
        List<CityDTO> municipios = new ArrayList<>();

        for (Object[] obj : objects) {
            CityDTO dto = new CityDTO();
            dto.setCode((String) obj[0]);
            dto.setName((String) obj[1]);
            municipios.add(dto);
        }
        return Response.ok(municipios).build();
    }

    @GET
    @Path("departamentos")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getDepartamentos(@HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        List<Object[]> objects = cityFacade.listDepartamentos(companyName, false);
        List<CityDTO> departamentos = new ArrayList<>();

        for (Object[] obj : objects) {
            CityDTO dto = new CityDTO();
            dto.setCode((String) obj[0]);
            dto.setName((String) obj[1]);
            departamentos.add(dto);
        }
        return Response.ok(departamentos).build();
    }
}