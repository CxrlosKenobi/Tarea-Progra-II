import packages.cart.*;
import packages.checkout.*;
import packages.customer.*;
import packages.order.*;

public class App {
    public static void main(String[] args) {
        // Casos de ejemplo
        // new OrdenDeVenta1();
        // new OrdenDeVenta2();
        new OrdenDeVenta3();
    }
}

class OrdenDeVenta1 {
    public OrdenDeVenta1() {
        // Información del Cliente
        Direccion direccion = new Direccion("308 Negra Arroyo Lane, Albuquerque, New Mexico.");
        Cliente cliente = new Cliente("Walter White", "12345677-9", direccion);

        // Articulos
        Articulo art1 = new Articulo("Efedrina", "Químico con propiedades estimulantes", 1000f, 0.250f);
        Articulo art2 = new Articulo("Acido Yodhidrico", "Químico con propiedades corrosivas", 500f, 0.500f);
        Articulo art3 = new Articulo("Fosforo rojo", "Químico con propiedades explosivas", 200f, 0.100f);
        Articulo art4 = new Articulo("Metal de litio", "Químico con propiedades inflamables", 300f, 0.200f);
        Articulo art5 = new Articulo("Amoniaco Anhidro", "Químico con propiedades corrosivas", 400f, 0.300f);

        // Orden de venta llamada "metanfetaminas" (Temático de la serie Breaking Bad)
        OrdenCompra metanfetaminas = new OrdenCompra(cliente);

        // Detalles de la orden
        metanfetaminas.addProducto(art1, 10);
        metanfetaminas.addProducto(art2, 5);
        metanfetaminas.addProducto(art3, 2);
        metanfetaminas.addProducto(art4, 3);
        metanfetaminas.addProducto(art5, 4);

        // Pagos
        Efectivo efectivo = new Efectivo(20000f);

        metanfetaminas.addPago(efectivo);
        metanfetaminas.finalizarOrden("Boleta");

        System.out.println(metanfetaminas);
    }
}

class OrdenDeVenta2 {
    public OrdenDeVenta2() {
        // Información del Cliente
        Direccion direccion = new Direccion("192 6th Ave, New York, New York.");
        Cliente cliente = new Cliente("Tom Hanks", "12345677-9", direccion);

        // Articulos
        Articulo art1 = new Articulo("Coca Cola", "Bebida gaseosa", 1000f, 0.250f);
        Articulo art2 = new Articulo("Pepsi", "Bebida gaseosa", 500f, 0.500f);
        Articulo art3 = new Articulo("Fanta", "Bebida gaseosa", 200f, 0.100f);
        Articulo art4 = new Articulo("Sprite", "Bebida gaseosa", 300f, 0.200f);
        Articulo art5 = new Articulo("7up", "Bebida gaseosa", 400f, 0.300f);

        OrdenCompra metanfetaminas = new OrdenCompra(cliente);

        // Detalles de la orden
        metanfetaminas.addProducto(art1, 10);
        metanfetaminas.addProducto(art2, 5);
        metanfetaminas.addProducto(art3, 2);
        metanfetaminas.addProducto(art4, 3);
        metanfetaminas.addProducto(art5, 4);

        // Pagos
        Tarjeta tarjeta = new Tarjeta(20000f, "00002", "Debito");
        metanfetaminas.addPago(tarjeta);

        metanfetaminas.finalizarOrden("Factura");

        System.out.println(metanfetaminas);
    }
}

class OrdenDeVenta3 {
    public OrdenDeVenta3() {
        Direccion direccion = new Direccion("1234 Main Street, Albuquerque, New Mexico");
        Cliente cliente = new Cliente("Buzz Lightyear", "9380291-9", direccion);

        Articulo art1 = new Articulo("5” Frame", "Cuerpo plástico para armazón de dron", 15000f, 0.250f);
        Articulo art2 = new Articulo("iFlight Xing E 2207", "Motor para quadcoptero", 13000f, 0.380f);
        Articulo art3 = new Articulo("HQProp 5” Propeller", "Hélice de tres cuchillas HQProp", 50000f, 0.010f);
        Articulo art4 = new Articulo("Flight Controller PyroDrone", "Controlador de Vuelo PyroDrone", 60000f, 0.150f);
        Articulo art5 = new Articulo("Tattu FunFly 1550", "Batería Lithium-Polymer (LiPo)", 60000f, 0.800f);
        Articulo art6 = new Articulo("GoPro Hero 8 or DJI Osmo Action", "Cámara de acción", 300000f, 0.300f);

        OrdenCompra fpvDrone = new OrdenCompra(cliente);

        fpvDrone.addProducto(art1, 1);
        fpvDrone.addProducto(art2, 4);
        fpvDrone.addProducto(art3, 2);
        fpvDrone.addProducto(art4, 1);
        fpvDrone.addProducto(art5, 2);
        fpvDrone.addProducto(art6, 1);

        Efectivo efectivo = new Efectivo(20000f);
        Tarjeta tarjeta = new Tarjeta(750000f, "00002", "Débito");

        fpvDrone.addPago(efectivo);
        fpvDrone.addPago(tarjeta);
        fpvDrone.finalizarOrden("Factura");

        System.out.println(fpvDrone);
    }
}
