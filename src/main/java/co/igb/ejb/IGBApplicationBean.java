package co.igb.ejb;

import co.igb.dto.CompanyDTO;
import co.igb.dto.ResponseDTO;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.util.Constants;
import org.apache.commons.lang3.StringUtils;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private HashMap<String, HashMap<String, Integer>> inventoryLocations = new HashMap<>();
    private HashMap<String, HashMap<String, Integer>> receptionLocations = new HashMap<>();

    @EJB
    private BinLocationFacade binFacade;

    @PostConstruct
    private void initialize() {
        loadProperties();
        consultarUbicacionesInventario();
        consultarUbicacionesRecepcion();
    }

    @GET
    @Path("recargar/")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response reloadConfig(@QueryParam("showprops") String showProps, @QueryParam("pruebas") boolean pruebas) {
        initialize();
        if (StringUtils.isNotBlank(showProps) && showProps.equals("yes")) {
            return Response.ok(new ResponseDTO(0, props)).build();
        } else {
            return Response.ok(new ResponseDTO(0, null)).build();
        }
    }

    @GET
    @Path("locations/{type}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response listStandardLocations(@PathParam("type") String type) {
        if (type != null && type.equals("inv")) {
            return Response.ok(new ResponseDTO(0, inventoryLocations)).build();
        } else if (type != null && type.equals("rec")) {
            return Response.ok(new ResponseDTO(0, receptionLocations)).build();
        } else {
            return Response.ok(new ResponseDTO(-1, "Debes enviar inv o rec como parametro")).build();
        }
    }

    private void loadProperties() {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(System.getProperty("PROPERTIES_SECRET"));
        props = new EncryptableProperties(encryptor);

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

            String pathValues = props.getProperty(Constants.NO_FILTER_PATHS);
            excludedPaths = new HashSet<>(Arrays.asList(pathValues.split(",")));

            String templateValues = props.getProperty(Constants.NO_FILTER_TEMPLATES);
            excludedPathTemplates = new ArrayList<>();
            for (String regex : templateValues.split(",")) {
                excludedPathTemplates.add(Pattern.compile(regex));
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "There was an error loading the file.", e);
        }
    }

    private void consultarUbicacionesRecepcion() {
        receptionLocations = new HashMap<>();
        String[] companies = props.getProperty(Constants.COMPANIES).split(";");
        for (String company : companies) {
            String[] confParts = company.split(",");
            String databaseName = confParts[0].trim();

            List<Object[]> bins = binFacade.findReceptionLocations(databaseName, new Boolean(confParts[2].trim()));
            if (bins != null) {
                for (Object[] row : bins) {
                    String warehouseCode = (String) row[0];
                    if (receptionLocations.containsKey(databaseName)) {
                        receptionLocations.get(databaseName).put(warehouseCode, (Integer) row[1]);
                    } else {
                        HashMap<String, Integer> entry = new HashMap<>();
                        entry.put(warehouseCode, (Integer) row[1]);
                        receptionLocations.put(databaseName, entry);
                    }
                }
            }
        }
        for (String databaseName : receptionLocations.keySet()) {
            for (String whsCode : receptionLocations.get(databaseName).keySet()) {
                CONSOLE.log(Level.INFO, String.format("{%s: {%s: %s}}", databaseName, whsCode, receptionLocations.get(databaseName).get(whsCode)));
            }
        }
        CONSOLE.log(Level.INFO, "Se cargaron ubicaciones de recepcion para {0} empresas", companies.length);
    }

    private void consultarUbicacionesInventario() {
        inventoryLocations = new HashMap<>();
        String[] companies = props.getProperty(Constants.COMPANIES).split(";");
        for (String company : companies) {
            String[] confParts = company.split(",");
            String databaseName = confParts[0].trim();

            List<Object[]> bins = binFacade.findInventoryLocationId(databaseName, new Boolean(confParts[2].trim()));
            if (bins != null) {
                for (Object[] row : bins) {
                    String warehouseCode = (String) row[0];
                    if (inventoryLocations.containsKey(databaseName)) {
                        inventoryLocations.get(databaseName).put(warehouseCode, (Integer) row[1]);
                    } else {
                        HashMap<String, Integer> entry = new HashMap<>();
                        entry.put(warehouseCode, (Integer) row[1]);
                        inventoryLocations.put(databaseName, entry);
                    }
                }
            }
        }
        for (String databaseName : inventoryLocations.keySet()) {
            for (String whsCode : inventoryLocations.get(databaseName).keySet()) {
                CONSOLE.log(Level.INFO, String.format("{%s: {%s: %s}}", databaseName, whsCode, inventoryLocations.get(databaseName).get(whsCode)));
            }
        }
        CONSOLE.log(Level.INFO, "Se cargaron ubicaciones de inventario para {0} empresas", companies.length);
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

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(args[0]);

        System.out.println(encryptor.encrypt(args[1]));
    }

    public Integer getInventoryBinId(String companyName, String warehouseCode) {
        return inventoryLocations.get(companyName).get(warehouseCode);
    }

    public Integer getReceptionBinId(String companyName, String warehouseCode) {
        return receptionLocations.get(companyName).get(warehouseCode);
    }

    public List<CompanyDTO> listCompanies() {
        List<CompanyDTO> companies = new ArrayList<>();
        String strCompaniesPropertyValue = obtenerValorPropiedad(Constants.COMPANIES);
        if (strCompaniesPropertyValue != null) {
            String[] strCompanies = strCompaniesPropertyValue.split(";");
            for (String strCompany : strCompanies) {
                String[] strCompanyData = strCompany.split(",");
                String companyId = strCompanyData[0].trim();
                String companyName = strCompanyData[1].trim();
                boolean testing = new Boolean(strCompanyData[2]);

                companies.add(new CompanyDTO(companyId, companyName, testing));
            }
        }
        Collections.sort(companies);
        CONSOLE.log(Level.INFO, "Se encontraron las siguientes empresas {0}", companies);
        return companies;
    }
}
