package co.igb.rest;

import co.igb.dto.AuthenticationResponseDTO;
import co.igb.dto.ResponseDTO;
import co.igb.dto.UserDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.exception.IGBAuthenticationException;
import co.igb.persistence.entity.User;
import co.igb.persistence.facade.GroupAllowedFacade;
import co.igb.persistence.facade.UserFacade;
import co.igb.persistence.facade.WarehouseFacade;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.google.gson.Gson;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("user")
public class UserREST {
    private static final Logger CONSOLE = Logger.getLogger(UserREST.class.getSimpleName());
    @EJB
    private UserFacade userFacade;
    @EJB
    private WarehouseFacade warehouseFacade;
    @Inject
    private IGBApplicationBean applicationBean;
    @EJB
    private GroupAllowedFacade groupAllowedFacade;

    @GET
    @Path("list/{groupName}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listEmployees(@PathParam("groupName") String groupName,
                                  @HeaderParam("X-Company-Name") String companyName,
                                  @HeaderParam("X-Pruebas") boolean pruebas) {
        return Response.ok(userFacade.findByMemberOfCompany(groupName, companyName, pruebas)).build();
    }

    @GET
    @Path("validate-user-admin/{user}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response validateUserGroup(@PathParam("user") String user,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        for (User u : userFacade.findByMemberOf(applicationBean.obtenerValorPropiedad("ldap.administrator.group"), companyName, pruebas)/*authenticator.listEmployeesInGroup(applicationBean.obtenerValorPropiedad("ldap.administrator.group")*/) {
            if (u.getUsername().equals(user)) {
                return Response.ok(new ResponseDTO(0, true)).build();
            }
        }
        return Response.ok(new ResponseDTO(0, false)).build();
    }

    @GET
    @Path("access/{username}/{module}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response approveUserAccess(@PathParam("username") String username,
                                      @PathParam("module") String module,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Validando si el usuario " + username + " puede acceder al modulo " + module);
        //obtain ldap groups that can access to the module
        List<String> allowedGroups = groupAllowedFacade.listAllowedGroups(module, companyName, pruebas);
        if (allowedGroups.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "El módulo " + module + " no tiene configurado nigún grupo de LDAP para poder accederlo")).build();
        }

        //check if user belongs to any of them
        for (String ldapGroup : allowedGroups) {
            //listar empleados en el grupo
            //List<UserDTO> users = authenticator.listEmployeesInGroup(ldapGroup, null);
            List<User> users = userFacade.findByMemberOf(ldapGroup, companyName, pruebas);

            for (User user : users) {
                if (user.getUsername().equalsIgnoreCase(username)) {
                    CONSOLE.log(Level.INFO, "El usuario " + username + " puede acceder al modulo " + module + " porque pertenece al grupo " + ldapGroup);
                    return Response.ok(new ResponseDTO(0, null)).build();
                }
            }
        }
        CONSOLE.log(Level.INFO, "El usuario " + username + " NO puede acceder al modulo " + module);
        return Response.ok(new ResponseDTO(-1, "El usuario no tiene permiso para acceder al módulo")).build();
    }

    @GET
    @Path("validate")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response validateToken() {
        //Si la llamada a este servicio llega hasta este metodo significa que no fue rechazada por el filtro,
        //por lo tanto el token enviado es valido
        CONSOLE.log(Level.INFO, "Token validado con exito. ");
        return Response.ok(new ResponseDTO(0, "Token validado con éxito")).build();
    }

    @GET
    @Path("{username}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getUserInfo(@PathParam("username") String username,
                                @HeaderParam("X-Company-Name") String companyName,
                                @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando datos de usuario {0} login. ", username);
        return Response.ok(new ResponseDTO(0, userFacade.find(username, companyName, pruebas)/*authenticator.getUserInfo(username)*/)).build();
    }

    @GET
    @Path("list-wali")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listUsers(@HeaderParam("X-Company-Name") String companyName,
                              @HeaderParam("X-Pruebas") boolean pruebas) {
        return Response.ok(userFacade.listAllUsersOfCompany(companyName, pruebas)).build();
    }

    @POST
    @Path("login/")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response login(UserDTO user,
                          @HeaderParam("X-Company-Name") String companyName,
                          @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Se recibieron datos de usuario para login {0}", user);
        if (user == null || user.getUsername() == null || user.getUsername().trim().isEmpty()
                || user.getPassword() == null || user.getPassword().trim().isEmpty()
                || user.getSelectedCompany() == null || user.getSelectedCompany().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se enviaron todos los datos necesarios para iniciar sesion. ");
            return Response.ok(new AuthenticationResponseDTO(1, "No se enviaron todos los datos necesarios para iniciar sesion. ")).build();
        }
        //Autenticar con directorio activo
        AuthenticationResponseDTO response = new AuthenticationResponseDTO(0, null);
        //authenticator.authenticateUser(user.getUsername(), user.getPassword());
        //if (response.getCode() == 0) {
        //user.setPassword(null);

        User userData = new User();
        try {
            userData = userFacade.find(user.getUsername(), companyName, pruebas);
            if (userData == null) {
                throw new NoResultException();
            }

            if (!userData.getUsername().equals(user.getUsername())) {
                return Response.ok(new AuthenticationResponseDTO(1, "El usuario no existe.")).build();
            }

            if (!userData.getPassword().equals(user.getPassword())) {
                return Response.ok(new AuthenticationResponseDTO(1, "Clave invalida.")).build();
            }

            if (!userData.getStatus().equals("activo")) {
                return Response.ok(new AuthenticationResponseDTO(1, "Clave deshabilitada.")).build();
            }

            //diff in msec
            long diff = System.currentTimeMillis() - userData.getLastUpdate().getTime();
            //diff in days
            long days = diff / (24 * 60 * 60 * 1000);

            if (days > 3) {
                try {
                    userData = getUserInfoFromLdap(user.getUsername(), user.getPassword(), false, user.getSelectedCompany(), pruebas);
                } catch (IGBAuthenticationException e) {
                    return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al autenticar al usuario.")).build();
                }
            } else {
                user.setEmail(userData.getEmail());
                user.setName(userData.getName());
                user.setSurname(userData.getSurname());
                user.setPassword(user.getPassword());
            }
        } catch (NoResultException e) {
            //No se tiene informacion del usuario. Consultar directorio activo y continuar
            try {
                userData = getUserInfoFromLdap(user.getUsername(), user.getPassword(), true, user.getSelectedCompany(), pruebas);
            } catch (IGBAuthenticationException ex) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al autenticar al usuario. ", ex);
                return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al autenticar al usuario.")).build();
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la informacion del usuario en la base de datos. ", e);
            return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al autenticar al usuario.")).build();
        }

        String token = tokenizeData(user.getUsername(), user.getName(), user.getSurname(), user.getEmail(), user.getPassword());
        if (token == null) {
            return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al autenticar al usuario.")).build();
        }
        try {
            user.setWarehouseCode(getWarehouseCode(user.getSelectedCompany(), pruebas));
        } catch (Exception e) {
            return Response.ok(new AuthenticationResponseDTO(1, "Ocurrio un error al obtener el código del almacén.")).build();
        }

        user.setToken(token);
        response.setUser(user);
        //}
        return Response.ok(response).build();
    }

    @POST
    @Path("create-wali")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response createUserWali(User dto,
                                   @HeaderParam("X-Company-Name") String companyName,
                                   @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando creacion de usuario de wali para la empresa {0}", companyName);

        if (dto.getUsername() == null || dto.getUsername().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo username es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo username es obligatorio.")).build();
        } else if (dto.getName() == null || dto.getName().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo name es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo name es obligatorio.")).build();
        } else if (dto.getSurname() == null || dto.getSurname().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo surname es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo surname es obligatorio.")).build();
        } else if (dto.getEmail() == null || dto.getEmail().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo email es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo email es obligatorio.")).build();
        } else if (dto.getPassword() == null || dto.getPassword().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo password es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo password es obligatorio.")).build();
        } else if (dto.getRol() == null || dto.getRol().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo rol es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo rol es obligatorio.")).build();
        } else if (dto.getMemberOf() == null || dto.getMemberOf().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo memberOf es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo memberOf es obligatorio.")).build();
        } else if (dto.getStatus() == null || dto.getStatus().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo status es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo status es obligatorio.")).build();
        }

        Gson gson = new Gson();
        String json = gson.toJson(dto);
        CONSOLE.log(Level.INFO, json);

        try {
            userFacade.create(dto, companyName, pruebas);
            return Response.ok(new ResponseDTO(0, "Usuario creado exitosamente.")).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error creando el usuario. ", e);
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error creando el usuario.")).build();
        }
    }

    @PUT
    @Path("update-wali")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response updateUserWali(User dto,
                                   @HeaderParam("X-Company-Name") String companyName,
                                   @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando actualizacion de usuario de wali para la empresa {0}", companyName);

        if (dto.getUsername() == null || dto.getUsername().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo username es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo username es obligatorio.")).build();
        } else if (dto.getName() == null || dto.getName().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo name es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo name es obligatorio.")).build();
        } else if (dto.getSurname() == null || dto.getSurname().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo surname es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo surname es obligatorio.")).build();
        } else if (dto.getEmail() == null || dto.getEmail().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo email es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo email es obligatorio.")).build();
        } else if (dto.getPassword() == null || dto.getPassword().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo password es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo password es obligatorio.")).build();
        } else if (dto.getRol() == null || dto.getRol().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo rol es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo rol es obligatorio.")).build();
        } else if (dto.getMemberOf() == null || dto.getMemberOf().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo memberOf es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo memberOf es obligatorio.")).build();
        } else if (dto.getStatus() == null || dto.getStatus().trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el usuario. Campo status es obligatorio.");
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el usuario. Campo status es obligatorio.")).build();
        }

        Gson gson = new Gson();
        String json = gson.toJson(dto);
        CONSOLE.log(Level.INFO, json);

        try {
            userFacade.edit(dto, companyName, pruebas);
            return Response.ok(new ResponseDTO(0, "Usuario modificado exitosamente.")).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error modificado el usuario. ", e);
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error modificado el usuario.")).build();
        }
    }

    private String getWarehouseCode(String companyName, boolean pruebas) {
        return warehouseFacade.listBinEnabledWarehouses(companyName, pruebas).get(0).getCode();
    }

    private User getUserInfoFromLdap(String username, String password, boolean create, String companyName, boolean pruebas) throws IGBAuthenticationException {
        //UserDTO userDataLdap = authenticator.getUserInfo(user.getUsername());
        User userDataLdap = userFacade.find(username, companyName, pruebas);

        if (userDataLdap == null) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener la informacion del usuario en LDAP (aunque ya se habia autenticado correctamente). ");
            throw new IGBAuthenticationException("Ocurrio un error al autenticar al usuario.");
        }
        User userDataSQL = new User();
        userDataSQL.setEmail(userDataLdap.getEmail());
        userDataSQL.setName(userDataLdap.getName());
        userDataSQL.setSurname(userDataLdap.getSurname());
        userDataSQL.setUsername(userDataLdap.getUsername());
        userDataSQL.setLastUpdate(new Date());
        userDataSQL.setPassword(password);
        userDataSQL.setRol(userDataLdap.getRol());
        userDataSQL.setCompanyName(userDataLdap.getCompanyName());
        userDataSQL.setMemberOf(userDataLdap.getMemberOf());
        userDataSQL.setStatus(userDataLdap.getStatus());

        if (create) {
            try {
                userFacade.create(userDataSQL, companyName, pruebas);
                //user = userDataLdap;
            } catch (Exception ex) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al guardar la informacion del usuario. ", ex);
                throw new IGBAuthenticationException("Ocurrio un error al autenticar al usuario.");
            }
        } else {
            try {
                userFacade.edit(userDataSQL, companyName, pruebas);
                //user = userDataLdap;
            } catch (Exception ex) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al guardar la informacion del usuario. ", ex);
                throw new IGBAuthenticationException("Ocurrio un error al autenticar al usuario.");
            }
        }
        //user.setCompanyName(companyName);
        userDataSQL.setCompanyName(companyName);
        return userDataSQL;
    }

    private String tokenizeData(String username, String name, String surname, String email, String password) {
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
                    .withClaim("password", password)
                    .sign(algorithm);
            CONSOLE.log(Level.INFO, "Token generado: {0}", token);
            return token;
        } catch (JWTCreationException e) {
            //UnsupportedEncodingException: UTF-8 encoding not supported
            //JWTCreationException: Invalid Signing configuration / Couldn't convert Claims.
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al generar el token JWT. ", e);
        }
        return null;
    }
}