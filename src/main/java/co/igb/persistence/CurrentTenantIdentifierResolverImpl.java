package co.igb.persistence;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

/**
 *
 * @author dbotero
 */
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

    private static final Logger CONSOLE = Logger.getLogger(CurrentTenantIdentifierResolverImpl.class.getSimpleName());
    public static ThreadLocal<String> _tenantIdentifier = new ThreadLocal<>();
    public static String DEFAULT_TENANT_ID = "IGB";

    @Override
    public String resolveCurrentTenantIdentifier() {
        CONSOLE.log(Level.INFO, "from inside resolveCurrentTenantIdentifier....");
        String tenantId = _tenantIdentifier.get();
        CONSOLE.log(Level.INFO, "==============================");
        CONSOLE.log(Level.INFO, "_tenantIdentifier: {0}", _tenantIdentifier.get());
        CONSOLE.log(Level.INFO, "==============================");
        if (tenantId == null) {
            tenantId = DEFAULT_TENANT_ID;
        }

        CONSOLE.log(Level.INFO, "threadlocal tenant id ={0}", tenantId);
        return tenantId;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }

}
