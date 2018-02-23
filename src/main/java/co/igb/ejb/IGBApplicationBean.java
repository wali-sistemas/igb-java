package co.igb.ejb;

import co.igb.persistence.facade.BinLocationFacade;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author dbotero
 */
@ApplicationScoped
@Named("igbApplicationBean")
@Path("application")
public class IGBApplicationBean implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(IGBApplicationBean.class.getSimpleName());

    private Properties props = new Properties();
    private HashSet<String> excludedPaths;
    private HashMap<String, Integer> inventoryLocations = new HashMap<>();
    @EJB
    private BinLocationFacade binFacade;

    @PostConstruct
    @GET
    @Path("recargar/")
    public void initialize() {
        cargarProperties();
        consultarUbicacionesInventario();
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

            String values = props.getProperty("igb.no-filter.paths");
            excludedPaths = new HashSet<>(Arrays.asList(values.split(",")));
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
        return excludedPaths.contains(path);
    }

    public Integer getInventoryBinId(String companyName) {
        return inventoryLocations.get(companyName);
    }
}
