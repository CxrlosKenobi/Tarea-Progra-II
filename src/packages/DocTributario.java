package packages;

import java.util.Date;

public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario(){
        numero = "";
        rut = "";
        fecha = new Date();
    }

}
