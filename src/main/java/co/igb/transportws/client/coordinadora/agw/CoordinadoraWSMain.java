package co.igb.transportws.client.coordinadora.agw;

import javax.ws.rs.core.Response;
import java.net.URL;

/**
 * @author jguisao
 */
public class CoordinadoraWSMain {

    public ArrayOfAgwCiudadesOut listCiudades(String wsdl, String user, String password) throws Exception {
        JRpcServerSoapManagerService service = new JRpcServerSoapManagerService(new URL(wsdl));
        JRpcServerSoapManagerPort port = service.getJRpcServerSoapManagerPort();

        AgwCiudadesIn request = new AgwCiudadesIn();
        request.setUsuario(user);
        request.setClave(password);

        ArrayOfAgwCiudadesOut response = port.guiasCiudades(request);

        return response;
    }

    public boolean anularGuia(String wsdl, String user, String password) throws Exception {
        JRpcServerSoapManagerService service = new JRpcServerSoapManagerService(new URL(wsdl));
        JRpcServerSoapManagerPort port = service.getJRpcServerSoapManagerPort();

        AgwTypeAnularGuiaIn request = new AgwTypeAnularGuiaIn();
        request.setUsuario(user);
        request.setClave(password);
        request.setCodigoRemision("12732000024");

        try {
            boolean response = port.guiasAnularGuia(request);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public AgwLiquidacionGuiaOut liquidarGuia(String wsdl, String user, String password) throws Exception {
        JRpcServerSoapManagerService service = new JRpcServerSoapManagerService(new URL(wsdl));
        JRpcServerSoapManagerPort port = service.getJRpcServerSoapManagerPort();

        AgwLiquidacionGuiaIn request = new AgwLiquidacionGuiaIn();
        request.setUsuario(user);
        request.setClave(password);
        request.setCodigoRemision("12732000021");

        try {
            AgwLiquidacionGuiaOut response = port.guiasLiquidacionGuia(request);
            return response;
        } catch (Exception e) {
            return new AgwLiquidacionGuiaOut();
        }
    }

    public AgwTypeReimprimirGuiaOut reimprimirGuia(String wsdl, String user, String password) throws Exception {
        JRpcServerSoapManagerService service = new JRpcServerSoapManagerService(new URL(wsdl));
        JRpcServerSoapManagerPort port = service.getJRpcServerSoapManagerPort();

        AgwTypeReimprimirGuiaIn request = new AgwTypeReimprimirGuiaIn();
        request.setUsuario(user);
        request.setClave(password);
        request.setCodigoRemision("12732000021");
        request.setMargenIzquierdo(2);
        request.setMargenSuperior(2);
        request.setFormatoImpresion("pdf");

        try {
            AgwTypeReimprimirGuiaOut response = port.guiasReimprimirGuia(request);
            return response;
        } catch (Exception e) {
            return new AgwTypeReimprimirGuiaOut();
        }
    }

    public static void main(String[] args) {
        CoordinadoraWSMain c = new CoordinadoraWSMain();
        try {
            System.out.println(c.anularGuia("https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php?wsdl", "igbmotorcycle.ws", "67da65ae4ae0ac406f02506c0cb0d8bd1bd037117dfacf17237e3f0da1cb00c2"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}