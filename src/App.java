import packages.*;

public class App {
    public static void main(String[] args){
        //Compradores
        Cliente cliente1 = new Cliente("Walter White", "12345677-9");
        Cliente cliente2 = new Cliente("Jesse Pinkman","12345678-9");

        //Articulos
        Articulo art1 = new Articulo("Efedrina", "Químico con propiedades estimulantes", 1000f, 0.250f);
        Articulo art2 = new Articulo("Acido Yodhidrico", "Químico con propiedades corrosivas", 500f, 0.500f);
        Articulo art3 = new Articulo("Fosforo rojo", "Químico con propiedades explosivas", 200f, 0.100f);
        Articulo art4 = new Articulo("Metal de litio", "Químico con propiedades inflamables", 300f, 0.200f);
        Articulo art5 = new Articulo("Amoniaco Anhidro", "Químico con propiedades corrosivas", 400f, 0.300f);
        
        //pagos
        Tarjeta tarjeta1 = new Tarjeta(1000.0f, "123456789", "Visa");
        Transferencia transferencia1 = new Transferencia(1000.0f, "Banco de Pelotillehue", "123456789");
        Efectivo efectivo1 = new Efectivo(1000.0f);
        Efectivo efectivo2 = new Efectivo(1000.0f);

        DetalleOrden detalle = new DetalleOrden();
        System.out.println(efectivo1);
        detalle.agregarArticulo(art1);
        detalle.agregarArticulo(art2);
        detalle.agregarArticulo(art3);
        detalle.agregarArticulo(art4);
        detalle.agregarArticulo(art5);
        //System.out.println(detalle);
      

    }
}
