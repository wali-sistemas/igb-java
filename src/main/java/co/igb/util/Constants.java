package co.igb.util;

public class Constants {
    public static final String INVOICE_SERIES = "igb.invoice.series";
    public static final String STOCK_TRANSFER_SERIES = "igb.stock-transfer.series";
    public static final String WAREHOUSE_CODE = "igb.warehouse.code";
    public static final String COMPANIES = "igb.login.companies";
    public static final String INITIAL_CONTEXT_FACTORY = "initial.context.factory";
    public static final String PROVIDER_URL = "provider.url";
    public static final String SECURITY_AUTHENTICATION = "security.authentication";
    public static final String SECURITY_PRINCIPAL_DOMAIN = "security.principal.domain";
    public static final String LDAP_QUERY_USER = "ldap.query.user";
    public static final String LDAP_QUERY_PASSWORD = "ldap.query.password";
    public static final String LDAP_USERS_CONTAINER = "OU=Usuarios,DC=igbcolombia,DC=local";
    public static final String LDAP_ENABLED_USERS_FILTER = "(&(objectClass=user)(!(userAccountControl:1.2.840.113556.1.4.803:=2)))";
    public static final String LDAP_USERNAME_FIELD = "sAMAccountName";
    public static final String LDAP_EMAIL_FIELD = "mail";
    public static final String LDAP_NAME_FIELD = "givenname";
    public static final String LDAP_LASTNAME_FIELD = "sn";
    public static final String LDAP_FULLNAME_FIELD = "cn";
    public static final String LDAP_MEMBEROF_FIELD = "memberOf";
    public static final String LDAP_MEMBEROF_FILTER = "CN=WMS,OU=Usuarios,DC=igbcolombia,DC=local";
    public static final String NO_FILTER_TEMPLATES = "igb.no-filter.templates";
    public static final String NO_FILTER_PATHS = "igb.no-filter.paths";
    public static final String EMAIL_HOST = "mail.host";
    public static final String EMAIL_PORT = "mail.port";
    public static final String EMAIL_USERNAME = "mail.username";
    public static final String EMAIL_PASSWORD = "mail.password";
    public static final String EMAIL_FROM_INVENTORY_INCONSISTENCY = "mail.from.inventory.inconsistency";
    public static final String EMAIL_SUBJECT_INVENTORY_INCONSISTENCY = "mail.subject.inventory.inconsistency";
    public static final String EMAIL_MSG_INVENTORY_INCONSISTENCY = "mail.msg.inventory.inconsistency";
    public static final String EMAIL_TO_INVENTORY_INCONSISTENCY = "mail.to.inventory.inconsistency";
    public static final String EMAIL_BCC_INVENTORY_INCONSISTENCY = "mail.bcc.inventory.inconsistency";
    public static final String EMAIL_FROM_PACKING_LIST= "mail.from.packing.list";
    public static final String EMAIL_SUBJECT_PACKING_LIST = "mail.subject.packing.list";
    public static final String EMAIL_MSG_PACKING_LIST = "mail.msg.packing.list";
    public static final String EMAIL_CC_PACKING_LIST = "mail.cc.packing.list";
    public static final String STATUS_CLOSED = "closed";
    public static final String STATUS_OPEN = "open";

    public static final String[] LDAP_ATTR_IDS = {"name", "givenName", "description", "sAMAccountname", "userPrincipalName", "sn", "distinguishedName", "cn", "mail", "memberOf"};
}
