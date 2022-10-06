package packages;
import java.util.*;
public class OrdenCompra{
    private DocTributario docTributario;
    private Date fecha;
    private String estado;
    private Cliente cliente;
    public OrdenCompra(){
        docTributario = null;
        fecha = new Date();
        estado = "Pendiente";
        cliente = null;
    }
    
    //Methods 
    public float calcPrecioSinIVA(){
        return 0;
    }
    public float calcIVA(){
        return 0;
    }

    public float calcPrecio(){
        return 0;
    }
    
    public float calcPeso(){
        return 0;
    }

    //getters and setters
    public void setDocTributario(DocTributario docTributario){
        this.docTributario = docTributario;
    }
    public DocTributario getDocTributario(){
        return docTributario;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return cliente;
    }

    @Override
    public String toString() {
        return "OrdenCompra [cliente=" + cliente + ", docTributario=" + docTributario + ", estado=" + estado + ", fecha="+ fecha + "]";
    }

}
