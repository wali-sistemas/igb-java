package co.igb.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.engine.jdbc.connections.spi.AbstractMultiTenantConnectionProvider;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

/**
 *
 * @author dbotero
 */
public class MultiTenantConnectionProviderImpl extends AbstractMultiTenantConnectionProvider {

    private static final Logger CONSOLE = Logger.getLogger(MultiTenantConnectionProviderImpl.class.getSimpleName());
    private HashMap<String, ConnectionProviderImpl> connProviderMap = new HashMap<>();

    public MultiTenantConnectionProviderImpl() {

        List<String> providerNames = new ArrayList<>();

        Properties props = new Properties();
        String serverConfUrl = System.getProperty("jboss.server.config.dir");
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

        String strCompaniesPropertyValue = props.getProperty("igb.login.companies");
        if (strCompaniesPropertyValue != null) {
            String[] strCompanies = strCompaniesPropertyValue.split(";");
            for (String strCompany : strCompanies) {
                String[] strCompanyData = strCompany.split(",");
                String companyId = strCompanyData[0].trim();
                providerNames.add(companyId);
            }
        }

        for (String providerName : providerNames) {
            connProviderMap.put(providerName, new ConnectionProviderImpl(providerName));
        }

        CONSOLE.log(Level.INFO, "Multi tenancy loaded. {0} tenants configured", connProviderMap.size());
    }

    @Override
    protected ConnectionProvider getAnyConnectionProvider() {
        CONSOLE.log(Level.INFO, "inside MultiTenantConnectionProvider::getAnyConnectionProvider");
        return connProviderMap.get(CurrentTenantIdentifierResolverImpl.DEFAULT_TENANT_ID);
    }

    @Override
    protected ConnectionProvider selectConnectionProvider(String tenantId) {
        CONSOLE.log(Level.INFO, "inside MultiTenantConnectionProvider::selectConnectionProvider. Selecting tenant [{0}]", tenantId);
        ConnectionProvider connectionProvider = connProviderMap.get(tenantId);
        if (connectionProvider == null) {
            connectionProvider = new ConnectionProviderImpl(CurrentTenantIdentifierResolverImpl.DEFAULT_TENANT_ID);
        }
        return connectionProvider;
    }
}
