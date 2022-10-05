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
class Cliente{
    private String nombre;
    private String rut;
    public Cliente(){}




    //getters y setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public String getRut(){
        return rut;
    }


    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", rut=" + rut + "]";
    }

}