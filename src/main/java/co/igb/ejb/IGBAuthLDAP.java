package co.igb.ejb;

import co.igb.dto.AuthenticationResponseDTO;
import co.igb.dto.UserDTO;
import co.igb.util.Constants;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
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
        auth.put(Context.INITIAL_CONTEXT_FACTORY, getProp(Constants.INITIAL_CONTEXT_FACTORY));
        auth.put(Context.PROVIDER_URL, getProp(Constants.PROVIDER_URL));
        auth.put(Context.SECURITY_AUTHENTICATION, getProp(Constants.SECURITY_AUTHENTICATION));
        auth.put(Context.SECURITY_PRINCIPAL, username + "@" + getProp(Constants.SECURITY_PRINCIPAL_DOMAIN));
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
        auth.put(Context.INITIAL_CONTEXT_FACTORY, getProp(Constants.INITIAL_CONTEXT_FACTORY));
        auth.put(Context.PROVIDER_URL, getProp(Constants.PROVIDER_URL));
        auth.put(Context.SECURITY_AUTHENTICATION, getProp(Constants.SECURITY_AUTHENTICATION));
        auth.put(Context.SECURITY_PRINCIPAL, getProp(Constants.LDAP_QUERY_USER) + "@" + getProp(Constants.SECURITY_PRINCIPAL_DOMAIN));
        auth.put(Context.SECURITY_CREDENTIALS, getProp(Constants.LDAP_QUERY_PASSWORD));

        String usersContainer = Constants.LDAP_USERS_CONTAINER;
        try {
            LdapContext ctx = new InitialLdapContext(auth, null);
            DirContext ctx1 = new InitialDirContext(auth);
            SearchControls ctls = new SearchControls();
            String[] attrIDs = Constants.LDAP_ATTR_IDS;

            ctls.setReturningAttributes(attrIDs);
            ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);
            //userAccountControl:1.2.840.113556.1.4.803:=2 --> excluye usuarios deshabilitados
            NamingEnumeration answer = ctx1.search(usersContainer, Constants.LDAP_ENABLED_USERS_FILTER, ctls);

            while (answer.hasMore()) {
                SearchResult rslt = (SearchResult) answer.next();
                Attributes attrs = rslt.getAttributes();
                Attribute usuario = attrs.get(Constants.LDAP_USERNAME_FIELD);

                if (usuario != null) {
                    if (usuario.get().equals(username)) {
                        String email;

                        try {
                            email = (String) attrs.get(Constants.LDAP_EMAIL_FIELD).get();
                        } catch (NullPointerException e) {
                            CONSOLE.log(Level.INFO, "El usuario {0} no tiene email" + usuario.get(), e);
                            email = null;
                        }

                        String name = (String) attrs.get(Constants.LDAP_NAME_FIELD).get();
                        String surname = (String) attrs.get(Constants.LDAP_LASTNAME_FIELD).get();
                        String completeName = (String) attrs.get(Constants.LDAP_FULLNAME_FIELD).get();

                        Attribute memberOf = attrs.get(Constants.LDAP_MEMBEROF_FIELD);
                        if (memberOf != null && memberOf.contains(Constants.LDAP_MEMBEROF_FILTER)) {
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
        auth.put(Context.INITIAL_CONTEXT_FACTORY, getProp(Constants.INITIAL_CONTEXT_FACTORY));
        auth.put(Context.PROVIDER_URL, getProp(Constants.PROVIDER_URL));
        auth.put(Context.SECURITY_AUTHENTICATION, getProp(Constants.SECURITY_AUTHENTICATION));
        auth.put(Context.SECURITY_PRINCIPAL, getProp(Constants.LDAP_QUERY_USER) + "@" + getProp(Constants.SECURITY_PRINCIPAL_DOMAIN));
        auth.put(Context.SECURITY_CREDENTIALS, getProp(Constants.LDAP_QUERY_PASSWORD));

        try {
            LdapContext ctx = new InitialLdapContext(auth, null);

            DirContext ctx1 = new InitialDirContext(auth);
            SearchControls ctls = new SearchControls();
            String[] attrIDs = Constants.LDAP_ATTR_IDS;

            ctls.setReturningAttributes(attrIDs);
            ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);
            NamingEnumeration answer = ctx1.search(Constants.LDAP_USERS_CONTAINER, Constants.LDAP_ENABLED_USERS_FILTER, ctls);

            while (answer.hasMore()) {
                SearchResult rslt = (SearchResult) answer.next();
                Attributes attrs = rslt.getAttributes();
                Attribute usuario = attrs.get(Constants.LDAP_USERNAME_FIELD);
                if (usuario != null) {
                    try {
                        Attribute memberOf = attrs.get(Constants.LDAP_MEMBEROF_FIELD);
                        if (memberOf != null && memberOf.contains("CN=" + groupName + "," + Constants.LDAP_USERS_CONTAINER)) {
                            String email = (String) attrs.get(Constants.LDAP_EMAIL_FIELD).get();
                            String name = (String) attrs.get(Constants.LDAP_NAME_FIELD).get();
                            String surname = (String) attrs.get(Constants.LDAP_LASTNAME_FIELD).get();
                            String completeName = (String) attrs.get(Constants.LDAP_FULLNAME_FIELD).get();

                            users.add(new UserDTO((String) usuario.get(), name, surname, email, completeName));
                        }
                    } catch (NullPointerException e) {
                        CONSOLE.log(Level.INFO, "El usuario {0} no tiene email en LDAP. ", usuario.get());
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