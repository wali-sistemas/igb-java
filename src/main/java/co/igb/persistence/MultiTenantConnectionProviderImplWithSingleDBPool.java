package co.igb.persistence;

import java.sql.Connection;
import java.sql.SQLException;
import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;

/**
 *
 * @author dbotero
 */
public class MultiTenantConnectionProviderImplWithSingleDBPool implements MultiTenantConnectionProvider {

    private final ConnectionProvider connectionProvider = new ConnectionProviderImpl(CurrentTenantIdentifierResolverImpl.DEFAULT_TENANT_ID);

    @Override
    public boolean isUnwrappableAs(Class arg0) {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> arg0) {
        return null;
    }

    @Override
    public Connection getAnyConnection() throws SQLException {
        System.out.println("inside MultiTenantConnectionProvider::getAnyConnection");
        return connectionProvider.getConnection();
    }

    @Override
    public void releaseAnyConnection(Connection connection) throws SQLException {
        connectionProvider.closeConnection(connection);
    }

    @Override
    public Connection getConnection(String tenantIdentifier) throws SQLException {
        final Connection connection = getAnyConnection();
        try {
            connection.createStatement().execute("USE " + tenantIdentifier);
        } catch (SQLException e) {
            throw new HibernateException(
                    "MultiTenantConnectionProvider::Could not alter JDBC connection to specified schema [" + tenantIdentifier + "]", e);
        }
        return connection;
    }

    @Override
    public void releaseConnection(String tenantIdentifier, Connection connection) throws SQLException {
        try {
            connection.createStatement().execute("USE default_db");
        } catch (SQLException e) {
            throw new HibernateException("Could not alter JDBC connection to specified schema [" + tenantIdentifier + "]", e);
        }
        connectionProvider.closeConnection(connection);
    }

    @Override
    public boolean supportsAggressiveRelease() {
        return false;
    }

}
