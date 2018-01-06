package co.igb.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author dbotero
 */
@ApplicationPath("res")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.igb.ejb.IGBApplicationBean.class);
        resources.add(co.igb.rest.BinLocationREST.class);
        resources.add(co.igb.rest.DeliveryNoteREST.class);
        resources.add(co.igb.rest.GenericOperationsREST.class);
        resources.add(co.igb.rest.ReceptionREST.class);
        resources.add(co.igb.rest.SalesOrdersREST.class);
        resources.add(co.igb.rest.StockTransferREST.class);
        resources.add(co.igb.rest.UserREST.class);
    }
}
