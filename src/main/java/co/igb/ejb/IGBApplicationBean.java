package co.igb.ejb;

import co.igb.persistence.facade.BinLocationFacade;
import co.igb.rest.ResponseDTO;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

/**
 * @author dbotero
 */
@ApplicationScoped
@Named("igbApplicationBean")
@Path("application")
public class IGBApplicationBean implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(IGBApplicationBean.class.getSimpleName());

    private Properties props = new Properties();
    private HashSet<String> excludedPaths;
    private List<Pattern> excludedPathTemplates;
    private HashMap<String, Integer> inventoryLocations = new HashMap<>();
    @EJB
    private BinLocationFacade binFacade;

    @PostConstruct
    public void initialize() {
        cargarProperties();
        consultarUbicacionesInventario();
    }

    @GET
    @Path("recargar/")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response reloadConfig(@QueryParam("showprops") String showProps) {
        initialize();
        if (StringUtils.isNotBlank(showProps) && showProps.equals("yes")) {
            return Response.ok(new ResponseDTO(0, props)).build();
        } else {
            return Response.ok(new ResponseDTO(0, null)).build();
        }
    }

    public void cargarProperties() {
        props = new Properties();
        String serverConfUrl = System.getProperty("jboss.server.config.dir");
        CONSOLE.log(Level.INFO, "Server config URL [{0}]", serverConfUrl);
        String propertiesFileName = "igb.properties";
        String path = serverConfUrl + File.separator + propertiesFileName;
        CONSOLE.log(Level.INFO, "Loading properties file: [{0}]", path);

        try {
            File propsFile = new File(path);
            if (propsFile.exists()) {
                props.load(new FileInputStream(propsFile));
            } else {
                props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("/" + propertiesFileName));
            }

            String pathValues = props.getProperty("igb.no-filter.paths");
            excludedPaths = new HashSet<>(Arrays.asList(pathValues.split(",")));

            String templateValues = props.getProperty("igb.no-filter.templates");
            excludedPathTemplates = new ArrayList<>();
            for (String regex : Arrays.asList(templateValues.split(","))) {
                excludedPathTemplates.add(Pattern.compile(regex));
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "There was an error loading the file.", e);
        }
    }

    private void consultarUbicacionesInventario() {
        inventoryLocations = new HashMap<>();
        String[] companies = props.getProperty("igb.login.companies").split(";");
        for (String company : companies) {
            String databaseName = company.split(",")[0].trim();
            Integer binAbs = binFacade.findInventoryLocationId(databaseName);
            if (binAbs > 0) {
                inventoryLocations.put(databaseName, binAbs);
            }
        }
        CONSOLE.log(Level.INFO, "Se cargaron {0} ubicaciones de inventario para {1} empresas", new Object[]{inventoryLocations.size(), companies.length});
    }

    public String obtenerValorPropiedad(String prop) {
        return props.getProperty(prop);
    }

    public boolean isPathExcludedFromTokenValidation(String path) {
        return excludedPaths.contains(path) || pathMatchesTemplate(path);
    }

    private boolean pathMatchesTemplate(String path) {
        for (Pattern pattern : excludedPathTemplates) {
            CONSOLE.log(Level.FINE, "Validando si la ruta {0} equivale a la plantilla {1}", new Object[]{path, pattern.pattern()});
            Matcher matcher = pattern.matcher(path);
            if (matcher.matches()) {
                CONSOLE.log(Level.INFO, "La ruta {0} equivale a la plantilla {1}", new Object[]{path, pattern.pattern()});
                return true;
            }
        }
        CONSOLE.log(Level.FINE, "La ruta {0} no equivale a ninguna de las plantillas", path);
        return false;
    }

    public Integer getInventoryBinId(String companyName) {
        return inventoryLocations.get(companyName);
    }
}
