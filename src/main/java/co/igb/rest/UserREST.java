package co.igb.rest;

import co.igb.rest.exception.IGBAuthenticationException;
import co.igb.dto.AuthenticationResponseDTO;
import co.igb.dto.UserDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.ejb.IGBAuthLDAP;
import co.igb.persistence.entity.User;
import co.igb.persistence.facade.UserFacade;
import co.igb.util.IGBUtils;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author martin
 */
@Stateless
@Path("user")
public class UserREST {

    private static final Logger CONSOLE = Logger.getLogger(UserREST.class.getSimpleName());

    @EJB
    private IGBAuthLDAP authenticator;
    @EJB
    private UserFacade userFacade;
    @Inject
    private IGBApplicationBean applicationBean;

    @POST
    @Path("login/")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response login(UserDTO user) {
        CONSOLE.log(Level.INFO, "Se recibieron datos de usuario para login {0}", user);
        if (user == null || user.getUsername() == null || user.getUsername().trim().isEmpty()
                || user.getPassword() == null || user.getPassword().trim().isEmpty()
                || user.getSelectedCompany() == null || user.getSelectedCompany().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se enviaron todos los datos necesarios para iniciar sesion. ");
            return Response.ok(new AuthenticationResponseDTO(1, "No se enviaron todos los datos necesarios para iniciar sesion. ")).build();
        }
        //Autenticar con directorio activo
        AuthenticationResponseDTO response = authenticator.authenticateUser(user.getUsername(), user.getPassword());
        if (response.getCode() == 0) {
            user.setPassword(null);
            try {
                User userData = userFacade.find(user.getUsername());
                if (userData == null) {
                    throw new NoResultException();
                }
                //TODO: validar si la ultima fecha de actualizacion es mayor a tres dias y actualizar datos desde LDAP

                //diff in msec
                long diff = System.currentTimeMillis() - userData.getLastUpdate().getTime();
                //diff in days
                long days = diff / (24 * 60 * 60 * 1000);

                if (days > 3) {
                    try {
                        user = getUserInfoFromLdap(user, false);
                    } catch (IGBAuthenticationException e) {
                        return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al autenticar al usuario (Post-LDAP). ")).build();
                    }
                } else {
                    user.setEmail(userData.getEmail());
                    user.setName(userData.getName());
                    user.setSurname(userData.getSurname());
                }

            } catch (NoResultException e) {
                //No se tiene informacion del usuario. Consultar directorio activo y continuar
                try {
                    user = getUserInfoFromLdap(user, true);
                } catch (IGBAuthenticationException ex) {
                    return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al autenticar al usuario (Post-LDAP). ")).build();
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la informacion del usuario en la base de datos. ", e);
                return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al autenticar al usuario (MySQL-Query). ")).build();
            }

            String token = tokenizeData(user.getUsername(), user.getName(), user.getSurname(), user.getEmail());
            if (token == null) {
                return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al autenticar al usuario (JWT). ")).build();
            }
            user.setToken(token);
            user.setWarehouseCode(IGBUtils.getProperParameter(applicationBean.obtenerValorPropiedad("igb.warehouse.code"), user.getSelectedCompany()));
            response.setUser(user);
        }
        return Response.ok(response).build();
    }

    private UserDTO getUserInfoFromLdap(UserDTO user, boolean create) throws IGBAuthenticationException {
        UserDTO userDataLdap = authenticator.getUserInfo(user.getUsername());
        if (userDataLdap == null) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener la informacion del usuario en LDAP (aunque ya se habia autenticado correctamente). ");
            throw new IGBAuthenticationException("Ocurrio un error al autenticar al usuario (Post-LDAP). ");
        }
        User userDataSQL = new User();
        userDataSQL.setEmail(userDataLdap.getEmail());
        userDataSQL.setName(userDataLdap.getName());
        userDataSQL.setSurname(userDataLdap.getSurname());
        userDataSQL.setUsername(userDataLdap.getUsername());
        userDataSQL.setLastUpdate(new Date());

        if (create) {
            try {
                userFacade.create(userDataSQL);
                user = userDataLdap;
            } catch (Exception ex) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al guardar la informacion del usuario en MySQL. ", ex);
                throw new IGBAuthenticationException("Ocurrio un error al autenticar al usuario (MySQL-Save). ");
            }
        } else {
            try {
                userFacade.edit(userDataSQL);
                user = userDataLdap;
            } catch (Exception ex) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al guardar la informacion del usuario en MySQL. ", ex);
                throw new IGBAuthenticationException("Ocurrio un error al autenticar al usuario (MySQL-Edit). ");
            }
        }
        return user;
    }

    private String tokenizeData(String username, String name, String surname, String email) {
        try {
            GregorianCalendar expTime = new GregorianCalendar();
            expTime.add(Calendar.MINUTE, Integer.parseInt(applicationBean.obtenerValorPropiedad("jwt.exp")));
            Algorithm algorithm = Algorithm.HMAC256(applicationBean.obtenerValorPropiedad("jwt.secret"));
            String token = JWT.create()
                    .withIssuedAt(new Date())
                    .withExpiresAt(expTime.getTime())
                    .withClaim("username", username)
                    .withClaim("name", name)
                    .withClaim("surname", surname)
                    .withClaim("email", email)
                    .sign(algorithm);
            CONSOLE.log(Level.INFO, "Token generado: {0}", token);
            return token;
        } catch (UnsupportedEncodingException | JWTCreationException e) {
            //UnsupportedEncodingException: UTF-8 encoding not supported
            //JWTCreationException: Invalid Signing configuration / Couldn't convert Claims.
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al generar el token JWT. ", e);
        }
        return null;
    }

    @GET
    @Path("list/{groupName}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response listEmployees(@PathParam("groupName") String groupName) {
        return Response.ok(authenticator.listEmployeesInGroup(groupName)).build();
    }

    @GET
    @Path("validate")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response validateToken() {
        //Si la llamada a este servicio llega hasta este metodo significa que no fue rechazada por el filtro,
        //por lo tanto el token enviado es valido
        CONSOLE.log(Level.INFO, "Token validado con exito. ");
        return Response.ok(new ResponseDTO(0, "Token validado con éxito")).build();
    }
}
