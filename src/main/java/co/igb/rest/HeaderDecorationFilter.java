package co.igb.rest;

import co.igb.ejb.IGBApplicationBean;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

/**
 *
 * @author dbotero
 */
@WebFilter("/res/*")
public class HeaderDecorationFilter implements Filter {

    private static final Logger CONSOLE = Logger.getLogger(HeaderDecorationFilter.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ((HttpServletResponse) response).addHeader("Access-Control-Allow-Origin", "*");
        ((HttpServletResponse) response).addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, X-Company-Name, Authorization");
        ((HttpServletResponse) response).addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, POST, PUT, DELETE");
        HttpServletRequest req = (HttpServletRequest) request;
        CONSOLE.log(Level.INFO, "Processing {0} method", req.getMethod());
        if (req.getMethod().equals("OPTIONS") || validateAuthorizationToken(req)) {
            CONSOLE.log(Level.INFO, "Processing continued");
            chain.doFilter(request, response);
        } else {
            CONSOLE.log(Level.INFO, "Processing halted with error");
            ((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }

    private boolean validateAuthorizationToken(HttpServletRequest request) {
        try {
            String path = request.getPathInfo();
            String authorizationToken = request.getHeader("Authorization");
            CONSOLE.log(Level.INFO, "Procesando solicitud a [{0}]", path);
            CONSOLE.log(Level.INFO, "Validando token [{0}]", authorizationToken);
            if (appBean.isPathExcludedFromTokenValidation(path)) {
                CONSOLE.log(Level.INFO, "La ruta solicitada no requiere validacion de token");
                return true;
            }

            Algorithm algorithm = Algorithm.HMAC256(appBean.obtenerValorPropiedad("jwt.secret"));
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(authorizationToken);
            CONSOLE.log(Level.INFO, "User in token: {0}", jwt.getClaim("username"));

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
