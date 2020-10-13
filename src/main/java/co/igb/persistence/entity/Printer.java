package co.igb.persistence.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author dbotero
 */
@Entity
@Table(name = "printer")
@NamedQueries({
    @NamedQuery(name = "Printer.findAll", query = "SELECT p FROM Printer p")})
public class Printer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprinter")
    private Long idPrinter;
    @Basic(optional = false)
    @Column(name = "printer_name")
    private String printerName;
    @Basic(optional = false)
    @Column(name = "print_service_name")
    private String printServiceName;

    public Printer() {
    }

    public Long getIdPrinter() {
        return idPrinter;
    }

    public void setIdPrinter(Long idPrinter) {
        this.idPrinter = idPrinter;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public String getPrintServiceName() {
        return printServiceName;
    }

    public void setPrintServiceName(String printServiceName) {
        this.printServiceName = printServiceName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.idPrinter);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Printer other = (Printer) obj;
        if (!Objects.equals(this.idPrinter, other.idPrinter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Printer{" + "idPrinter=" + idPrinter + ", printerName=" + printerName + ", printServiceName=" + printServiceName + '}';
    }

}
