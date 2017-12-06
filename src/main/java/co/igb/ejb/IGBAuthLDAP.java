package co.igb.ejb;

import co.igb.dto.AuthenticationResponseDTO;
import co.igb.dto.UserDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

/**
 *
 * @author dbotero
 */
@Stateless
public class IGBAuthLDAP {

    private static final Logger CONSOLE = Logger.getLogger(IGBAuthLDAP.class.getSimpleName());
    @Inject
    private IGBApplicationBean aplicationBean;

    public IGBAuthLDAP() {
    }

    private String getProp(String key) {
        return aplicationBean.obtenerValorPropiedad(key);
    }

    public AuthenticationResponseDTO authenticateUser(String username, String password) {
        Hashtable<String, Object> auth = new Hashtable<>();
        auth.put(Context.INITIAL_CONTEXT_FACTORY, getProp("initial.context.factory"));
        auth.put(Context.PROVIDER_URL, getProp("provider.url"));
        auth.put(Context.SECURITY_AUTHENTICATION, getProp("security.authentication"));
        auth.put(Context.SECURITY_PRINCIPAL, username + "@" + getProp("security.principal.domain"));
        auth.put(Context.SECURITY_CREDENTIALS, password);

        try {
            // Create the initial context
            DirContext ctx = new InitialDirContext(auth);
            CONSOLE.log(Level.INFO, "Usuario [{0}] autenticado.", username);
            return new AuthenticationResponseDTO(0, null);
        } catch (NamingException ex) {
            CONSOLE.log(Level.SEVERE, "Error autenticando al usuario. {0}", ex.getMessage());
            String mensaje = ex.getMessage();
            String valor = mensaje.substring(mensaje.indexOf("data") + 5, mensaje.indexOf("data") + 8);
            switch (valor) {
                case "525":
                    //525 - user not found
                    CONSOLE.log(Level.SEVERE, "El usuario no existe. ");
                    return new AuthenticationResponseDTO(1, "El usuario no existe.");
                case "52e":
                    //52e - invalid credentials
                    CONSOLE.log(Level.SEVERE, "Clave invalida. ");
                    return new AuthenticationResponseDTO(1, "Clave invalida.");
                case "530":
                    //530 - not permitted to logon at this time
                    CONSOLE.log(Level.SEVERE, "No fue posible iniciar en este momento, intente de nuevo mas tarde. ");
                    return new AuthenticationResponseDTO(1, "No fue posible iniciar en este momento, intente de nuevo mas tarde.");
                case "532":
                    //532 - password expired
                    CONSOLE.log(Level.SEVERE, "La clave ha expirado. ");
                    return new AuthenticationResponseDTO(1, "La clave ha expirado.");
                case "533":
                    //533 - account disabled
                    CONSOLE.log(Level.SEVERE, "Cuenta deshabilitada. ");
                    return new AuthenticationResponseDTO(1, "Cuenta deshabilitada.");
                case "701":
                    //701 - account expired
                    CONSOLE.log(Level.SEVERE, "La cuenta ha expirado. ");
                    return new AuthenticationResponseDTO(1, "La cuenta ha expirado.");
                case "773":
                    //773 - user must reset password
                    CONSOLE.log(Level.SEVERE, "Debe restablecer su contraseña antes de iniciar sesion. ");
                    return new AuthenticationResponseDTO(1, "Debe restablecer su contraseña antes de iniciar sesion.");
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error no identificado al validar el usuario contra el directorio activo. ", e);
        }
        return new AuthenticationResponseDTO(1, "Ocurrio un error no identificado al validar el usuario contra el directorio activo.");
    }

    public UserDTO getUserInfo(String username) {
        Hashtable<String, Object> auth = new Hashtable<>();
        auth.put(Context.INITIAL_CONTEXT_FACTORY, getProp("initial.context.factory"));
        auth.put(Context.PROVIDER_URL, getProp("provider.url"));
        auth.put(Context.SECURITY_AUTHENTICATION, getProp("security.authentication"));
        auth.put(Context.SECURITY_PRINCIPAL, getProp("ldap.query.user") + "@" + getProp("security.principal.domain"));
        auth.put(Context.SECURITY_CREDENTIALS, getProp("ldap.query.password"));

        String usersContainer = "OU=Usuarios,DC=igbcolombia,DC=local";
        try {
            LdapContext ctx = new InitialLdapContext(auth, null);
            DirContext ctx1 = new InitialDirContext(auth);
            SearchControls ctls = new SearchControls();
            String[] attrIDs = {"name", "givenName", "description", "sAMAccountname", "userPrincipalName", "sn", "distinguishedName", "cn", "mail", "memberOf"};

            ctls.setReturningAttributes(attrIDs);
            ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);
            //userAccountControl:1.2.840.113556.1.4.803:=2 --> excluye usuarios deshabilitados
            NamingEnumeration answer = ctx1.search(usersContainer, "(&(objectClass=user)(!(userAccountControl:1.2.840.113556.1.4.803:=2)))", ctls);

            while (answer.hasMore()) {
                SearchResult rslt = (SearchResult) answer.next();
                Attributes attrs = rslt.getAttributes();
                Attribute usuario = attrs.get("sAMAccountName");

                if (usuario != null) {
                    if (((String) usuario.get()).equals(username)) {
                        String email = (String) attrs.get("userprincipalname").get();
                        String name = (String) attrs.get("givenname").get();
                        String surname = (String) attrs.get("sn").get();
                        String completeName = (String) attrs.get("cn").get();

                        Attribute memberOf = attrs.get("memberOf");
                        if (memberOf != null && memberOf.contains("CN=WMS,OU=Usuarios,DC=igbcolombia,DC=local")) {
                            ctx1.close();
                            return new UserDTO(username, name, surname, email, completeName);
                        } else {
                            CONSOLE.log(Level.SEVERE, "El usuario {0} no pertenece al grupo WMS y por lo tanto no tiene permitido iniciar sesion en la aplicacion");
                        }
                    }
                }
                ctx1.close();
            }
        } catch (NamingException e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la informacion del usuario " + username + " en LDAP. ", e);
        }
        return null;
    }

    public List<UserDTO> listEmployeesInGroup(String groupName) {
        List<UserDTO> users = new ArrayList<>();
        Hashtable<String, Object> auth = new Hashtable<>();
        auth.put(Context.INITIAL_CONTEXT_FACTORY, getProp("initial.context.factory"));
        auth.put(Context.PROVIDER_URL, getProp("provider.url"));
        auth.put(Context.SECURITY_AUTHENTICATION, getProp("security.authentication"));
        auth.put(Context.SECURITY_PRINCIPAL, getProp("ldap.query.user") + "@" + getProp("security.principal.domain"));
        auth.put(Context.SECURITY_CREDENTIALS, getProp("ldap.query.password"));

        String usersContainer = "OU=Usuarios,DC=igbcolombia,DC=local";
        try {
            LdapContext ctx = new InitialLdapContext(auth, null);

            DirContext ctx1 = new InitialDirContext(auth);
            SearchControls ctls = new SearchControls();
            String[] attrIDs = {"name", "givenName", "description", "sAMAccountname", "userPrincipalName", "sn", "distinguishedName", "cn", "mail", "memberOf"};

            ctls.setReturningAttributes(attrIDs);
            ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);
            NamingEnumeration answer = ctx1.search(usersContainer, "(&(objectClass=user)(!(userAccountControl:1.2.840.113556.1.4.803:=2)))", ctls);

            while (answer.hasMore()) {
                SearchResult rslt = (SearchResult) answer.next();
                Attributes attrs = rslt.getAttributes();
                Attribute usuario = attrs.get("sAMAccountName");
                if (usuario != null) {
                    Attribute memberOf = attrs.get("memberOf");
                    if (memberOf != null && memberOf.contains("CN=" + groupName + ",OU=Usuarios,DC=igbcolombia,DC=local")) {
                        String email = (String) attrs.get("userprincipalname").get();
                        String name = (String) attrs.get("givenname").get();
                        String surname = (String) attrs.get("sn").get();
                        String completeName = (String) attrs.get("cn").get();

                        users.add(new UserDTO((String) usuario.get(), name, surname, email, completeName));
                    }
                }
                ctx1.close();
            }
            Collections.sort(users);
        } catch (NamingException nex) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar los usuarios del grupo " + nex, nex);
        }
        return users;
    }
}
