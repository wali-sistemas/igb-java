package co.igb.ejb;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
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

    @PostConstruct
    @GET
    @Path("recargar/")
    public void initialize() {
        cargarProperties();
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
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "There was an error loading the file.", e);
        }
    }

    public String obtenerValorPropiedad(String prop) {
        return props.getProperty(prop);
    }
}
