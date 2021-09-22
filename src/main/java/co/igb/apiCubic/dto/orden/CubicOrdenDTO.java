package co.igb.apiCubic.dto.orden;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CubicOrdenDTO implements Serializable {
    protected Integer nit;
    protected String usuario;
    protected String llave;
    protected OrdenTrabajo ordenTrabajo;

    public CubicOrdenDTO() {
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public OrdenTrabajo getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public static class OrdenTrabajo {
        protected Encabezado encabezado;
        protected List<item> items;

        public Encabezado getEncabezado() {
            return encabezado;
        }

        public void setEncabezado(Encabezado encabezado) {
            this.encabezado = encabezado;
        }

        public List<item> getItems() {
            return items;
        }

        public void setItems(List<item> items) {
            this.items = items;
        }

        public static class Encabezado {
            protected String numDocumento;
            protected String tipoDocumento;
            protected String tipoMovimiento;
            protected String codConcepto;
            protected Operacion operacion;

            public String getNumDocumento() {
                return numDocumento;
            }

            public void setNumDocumento(String numDocumento) {
                this.numDocumento = numDocumento;
            }

            public String getTipoDocumento() {
                return tipoDocumento;
            }

            public void setTipoDocumento(String tipoDocumento) {
                this.tipoDocumento = tipoDocumento;
            }

            public String getTipoMovimiento() {
                return tipoMovimiento;
            }

            public void setTipoMovimiento(String tipoMovimiento) {
                this.tipoMovimiento = tipoMovimiento;
            }

            public String getCodConcepto() {
                return codConcepto;
            }

            public void setCodConcepto(String codConcepto) {
                this.codConcepto = codConcepto;
            }

            public Operacion getOperacion() {
                return operacion;
            }

            public void setOperacion(Operacion operacion) {
                this.operacion = operacion;
            }

            public static class Operacion {
                protected String codAgencia;
                protected String numDeposito;

                public String getCodAgencia() {
                    return codAgencia;
                }

                public void setCodAgencia(String codAgencia) {
                    this.codAgencia = codAgencia;
                }

                public String getNumDeposito() {
                    return numDeposito;
                }

                public void setNumDeposito(String numDeposito) {
                    this.numDeposito = numDeposito;
                }
            }
        }

        public static class item {
            protected Long numItem;
            protected Referencia referencia;
            protected Integer cantidad;

            public Long getNumItem() {
                return numItem;
            }

            public void setNumItem(Long numItem) {
                this.numItem = numItem;
            }

            public Referencia getReferencia() {
                return referencia;
            }

            public void setReferencia(Referencia referencia) {
                this.referencia = referencia;
            }

            public Integer getCantidad() {
                return cantidad;
            }

            public void setCantidad(Integer cantidad) {
                this.cantidad = cantidad;
            }

            public static class Referencia {
                protected String refPrincipal;

                public String getRefPrincipal() {
                    return refPrincipal;
                }

                public void setRefPrincipal(String refPrincipal) {
                    this.refPrincipal = refPrincipal;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "CubicOrdenDTO{" +
                "nit=" + nit +
                ", usuario='" + usuario + '\'' +
                ", llave='" + llave + '\'' +
                ", ordenTrabajo=" + ordenTrabajo +
                '}';
    }
}