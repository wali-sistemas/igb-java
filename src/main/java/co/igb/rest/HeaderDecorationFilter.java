package co.igb.rest;

import co.igb.dto.LogEntry;
import co.igb.ejb.IGBApplicationBean;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.apache.commons.io.IOUtils;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
@WebFilter("/res/*")
public class HeaderDecorationFilter implements Filter {

    private static final Logger CONSOLE = Logger.getLogger(HeaderDecorationFilter.class.getSimpleName());
    private static final String ALLOWED_HEADERS = "Origin, X-Requested-With, Content-Type, Accept, X-Company-Name, Authorization, X-Employee, X-Warehouse-Code, X-Pruebas";
    private static final String ALLOWED_METHODS = "GET, OPTIONS, POST, PUT, DELETE";
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    @Inject
    private IGBApplicationBean appBean;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ((HttpServletResponse) response).addHeader("Access-Control-Allow-Origin", "*");
        ((HttpServletResponse) response).addHeader("Access-Control-Allow-Headers", ALLOWED_HEADERS);
        ((HttpServletResponse) response).addHeader("Access-Control-Allow-Methods", ALLOWED_METHODS);
        ((HttpServletResponse) response).addHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        ((HttpServletResponse) response).addHeader("Pragma", "no-cache");
        ((HttpServletResponse) response).addHeader("Expires", "0");

        HttpServletRequest req = (HttpServletRequest) request;
        CONSOLE.log(Level.FINE, "Processing {0} method", req.getMethod());
        if (req.getMethod().equals("OPTIONS") || validateAuthorizationToken(req)) {
            CONSOLE.log(Level.FINE, "Processing continued");
            printData(req);
            chain.doFilter(request, response);
        } else {
            CONSOLE.log(Level.FINE, "Processing halted with error");
            ((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }

    private void printData(HttpServletRequest request) {
        LogEntry entry = new LogEntry();
        entry.setTimestamp(sdf.format(new GregorianCalendar().getTime()));
        entry.setClientIP(request.getRemoteAddr());
        entry.setPath(request.getPathInfo());
        entry.setMethod(request.getMethod());

        if(entry.getMethod().equals("POST") || entry.getMethod().equals("PUT")) {
            try {
                entry.setBody(IOUtils.toString(request.getReader()));
            } catch(IOException e) {}
        }

        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            entry.addHeader(headerName, request.getHeader(headerName));
        }

        try {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(entry);
            CONSOLE.log(Level.INFO, json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private boolean validateAuthorizationToken(HttpServletRequest request) {
        try {
            String path = request.getPathInfo();
            String authorizationToken = request.getHeader("Authorization");
            CONSOLE.log(Level.INFO, "Procesando solicitud a [{0}] desde [{1}]",
                    new Object[]{request.getMethod() + " " + path, request.getRemoteAddr()});
            CONSOLE.log(Level.FINE, "Validando token [{0}]", authorizationToken);
            if (appBean.isPathExcludedFromTokenValidation(path)) {
                CONSOLE.log(Level.FINE, "La ruta solicitada no requiere validacion de token");
                return true;
            }

            Algorithm algorithm = Algorithm.HMAC256(appBean.obtenerValorPropiedad("jwt.secret"));
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(authorizationToken);
            CONSOLE.log(Level.FINE, "User in token: {0}", jwt.getClaim("username").asString());

            return true;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al validar el token. ", e);
            return false;
        }
    }

    @Override
    public void destroy() {
    }

}
