package co.igb.transportws.client.coordinadora.ags;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jguisao
 */
public class CoordinadoraWSMain {

    /**
     *
     * @param wsdl ruta para el wsdl del servicio
     * @param ciudadDestino el codigo de 8 caracteres de la ciudad destino. Si
     * la ciudad es Medellin, por ejemplo (05001), codigo a enviar debe ser
     * 05001000
     * @param articulos mapa que contiene la ciudad de origen de los productos
     * que vienen en la lista. Esta lista contiene el detalle de cada producto
     * en el siguiente orden: 1.alto, 2. ancho, 3. largo, 4. peso, 5. unidades,
     * 6. valor
     * @return valor total del envio
     * @throws java.lang.Exception
     */
    public int cotizarEnvio(String wsdl, String ciudadDestino, Map<String, List<String[]>> articulos) throws Exception {
        RpcServerSoapManagerService service = new RpcServerSoapManagerService(new URL(wsdl));
        int valoracionMcia = 0;
        int totalEnvio = 0;
        RpcServerSoapManagerPort port = service.getRpcServerSoapManagerPort();
        for (String ciudadOrigen : articulos.keySet()) {
            valoracionMcia = 0;
            CotizadorCotizarIn request = new CotizadorCotizarIn();
            request.setApikey("556c71cc-90c7-11ec-b909-0242ac120002");
            request.setClave("uB9rX2oD3zI0uH5h");
            request.setCuenta("1");
            request.setDiv("01");
            request.setNit("811011909");
            request.setProducto("0");
            request.setDestino(ciudadDestino);
            request.setOrigen(ciudadOrigen);

            ArrayOfInt nivelServ = new ArrayOfInt();
            nivelServ.getItem().add(0);
            request.setNivelServicio(nivelServ);

            ArrayOfCotizadorDetalleempaques detalle = new ArrayOfCotizadorDetalleempaques();
            List<String[]> items = articulos.get(ciudadOrigen);
            for (String[] item : items) {
                CotizadorDetalleEmpaques itm = new CotizadorDetalleEmpaques();
                itm.setAlto(item[0]);
                itm.setAncho(item[1]);
                itm.setLargo(item[2]);
                itm.setPeso(item[3]);
                itm.setUnidades(item[4]);
                itm.setUbl("0");
                detalle.getItem().add(itm);
                valoracionMcia += Integer.parseInt(item[5]) * Integer.parseInt(item[4]);
            }
            request.setValoracion(Integer.toString(valoracionMcia));
            request.setDetalle(detalle);
            CotizadorCotizarOut response = port.cotizadorCotizar(request);
            totalEnvio += response.getFleteTotal();
        }
        return totalEnvio;
    }

    public static void main(String[] args) {
        CoordinadoraWSMain c = new CoordinadoraWSMain();
        Map<String, List<String[]>> m = new HashMap<>();
        List<String[]> s = new ArrayList<>();

        String[] a = new String[6];

        a[0] = "83";
        a[1] = "69";
        a[2] = "84";
        a[3] = "29";
        a[4] = "1";
        a[5] = "200000";

        s.add(a);
        m.put("05088000", s);

        try {
            System.out.println(c.cotizarEnvio("https://sandbox.coordinadora.com/ags/1.5/server.php?wsdl", "05001002", m));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
