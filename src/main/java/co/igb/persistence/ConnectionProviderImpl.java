package co.igb.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

/**
 *
 * @author dbotero
 */
public class ConnectionProviderImpl implements ConnectionProvider {

    private final BasicDataSource basicDataSource = new BasicDataSource();
    private static Properties props = new Properties();
    private static final Logger CONSOLE = Logger.getLogger(ConnectionProviderImpl.class.getSimpleName());

    private void loadProperties() {
        props = new Properties();
        String serverConfUrl = System.getProperty("jboss.server.config.dir");
        String propertiesFileName = "igb.properties";
        String path = serverConfUrl + File.separator + propertiesFileName;

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

    public ConnectionProviderImpl(String database) {
        CONSOLE.log(Level.INFO, "Agregando conexion para base de datos {0}", database);
        if (props == null || props.isEmpty()) {
            loadProperties();
        }
        basicDataSource.setDriverClassName(props.getProperty("igb.database.driverClass"));
        basicDataSource.setUrl(props.getProperty("igb.database.connectionUrl") + database);
        basicDataSource.setUsername(props.getProperty("igb.database.userName"));
        basicDataSource.setPassword(props.getProperty("igb.database.password"));
        basicDataSource.setInitialSize(2);
        basicDataSource.setMaxTotal(10);
    }

    @Override
    public boolean isUnwrappableAs(Class arg0) {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> arg0) {
        return null;
    }

    @Override
    public void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return basicDataSource.getConnection();
    }

    @Override
    public boolean supportsAggressiveRelease() {
        return false;
    }

}
