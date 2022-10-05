import java.util.*;

public class App {
    public static void main(String[] args){
        System.out.println("hola");

    }
}


class OrdenCompra{
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

class Direccion{

}

class DocTributario{

}

class Boleta{

}

class Factura{

}

abstract class Pago{
    private float monto;
    private Date fecha;

}

class Efectivo extends Pago{
    public Efectivo(){}
    public float calcDevolucion(){
        return 0;
    }

}



class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(){  }
    
}

class Tarjeta extends Pago{


}

class Articulo{
private float peso;
private String nombre;
private String descripcion;
private float precio;
    //Inicializo los valores en el constructor
    public Articulo(){
        peso = 0;
        nombre = "";
        descripcion = "";
        precio = 0;
    }
    public Articulo(String nombre, String descripcion, float precio, float peso ){
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo [descripcion=" + descripcion + ", nombre=" + nombre + ", peso=" + peso + ", precio=" + precio+ "]";
    }
}

class detalleOrden{
    private ArrayList<Articulo> articulos;
    private int cantidad;


    public detalleOrden(){
        articulos = new ArrayList<Articulo>();
        cantidad = 0;
    }

    public void agregarArticulo(Articulo a){
        articulos.add(a);
        this.cantidad++;
    }

    public void eliminarArticulo(Articulo a){
        articulos.remove(a);
        this.cantidad--;
    }
}

