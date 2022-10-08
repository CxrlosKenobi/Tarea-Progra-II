package packages;

import java.util.Date;

public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario() {
        this.numero = "";
        this.rut = "";
        this.fecha = new Date();
    }

    public String getNumero() {
        return numero;
    }
    public String getRut() {
        return rut;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }

}
