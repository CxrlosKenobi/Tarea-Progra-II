import packages.cart.Articulo;
import packages.checkout.Efectivo;
import packages.customer.Cliente;
import packages.customer.Direccion;
import packages.order.OrdenCompra;

public class App {
    public static void main(String[] args) {
        // Información del Cliente 
        Direccion direccion1 = new Direccion("308 Negra Arroyo Lane, Albuquerque, New Mexico.");
        Cliente cliente1 = new Cliente("Walter White", "12345677-9", direccion1);


        // Articulos
        Articulo art1 = new Articulo("Efedrina", "Químico con propiedades estimulantes", 1000f, 0.250f);
        Articulo art2 = new Articulo("Acido Yodhidrico", "Químico con propiedades corrosivas", 500f, 0.500f);
        Articulo art3 = new Articulo("Fosforo rojo", "Químico con propiedades explosivas", 200f, 0.100f);
        Articulo art4 = new Articulo("Metal de litio", "Químico con propiedades inflamables", 300f, 0.200f);
        Articulo art5 = new Articulo("Amoniaco Anhidro", "Químico con propiedades corrosivas", 400f, 0.300f);


        // Orden de venta llamada "metanfetaminas" (Temática de la serie Breaking Bad)
        OrdenCompra metanfetaminas = new OrdenCompra(cliente1);
       
       
        // Detalles de la orden
        metanfetaminas.addProducto(art1, 10);
        metanfetaminas.addProducto(art2, 5);
        metanfetaminas.addProducto(art3, 2);
        metanfetaminas.addProducto(art4, 3);
        metanfetaminas.addProducto(art5, 4);
        

        // Pagos
        Efectivo efectivo1 = new Efectivo(20000.0f);

        metanfetaminas.addPago(efectivo1);
        metanfetaminas.finalizarOrden("Boleta");

        System.out.println("\n" + metanfetaminas);
    }
}
