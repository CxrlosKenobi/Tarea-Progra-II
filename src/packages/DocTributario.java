package packages;

import java.util.Date;

public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;

    public DocTributario() {
        this.numero = "";
        this.rut = "";
        this.fecha = new Date();
        this.direccion = null;
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

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "DocTributario [fecha=" + fecha + ", numero=" + numero + ", rut=" + rut + ", tipo="
                + this.getClass().getSimpleName() + "]";
    }
}
