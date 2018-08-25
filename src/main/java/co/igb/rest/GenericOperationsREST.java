package co.igb.rest;

import co.igb.dto.CompanyDTO;
import co.igb.dto.ResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.WarehouseFacade;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
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

    @GET
    @Path("companies")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response listCompanies() {
        CONSOLE.log(Level.INFO, "Listando empresas disponibles para login");
        List<CompanyDTO> companies = new ArrayList<>();
        String strCompaniesPropertyValue = applicationBean.obtenerValorPropiedad(Constants.COMPANIES);
        if (strCompaniesPropertyValue != null) {
            String[] strCompanies = strCompaniesPropertyValue.split(";");
            for (String strCompany : strCompanies) {
                String[] strCompanyData = strCompany.split(",");
                String companyId = strCompanyData[0].trim();
                String companyName = strCompanyData[1].trim();

                companies.add(new CompanyDTO(companyId, companyName));
            }
        }
        CONSOLE.log(Level.INFO, "Se encontraron las siguientes empresas {0}", companies);
        return Response.ok(companies).build();
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
    public Response listWarehouses(@HeaderParam("X-Company-Name") String companyName) {
        return Response.ok(new ResponseDTO(0, warehouseFacade.listBinEnabledWarehouses(companyName))).build();
    }
}
