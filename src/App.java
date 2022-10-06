import packages.*;

public class App {
    public static void main(String[] args){
        Articulo art1 = new Articulo("Coca Cola","Una gaseosa", 200.0f, 0.500f);
        Articulo art2 = new Articulo("Pepsi", "Una gaseosa", 1600.0f, 0.500f);
        Articulo art3 = new Articulo("Fanta", "Una gaseosa", 1600.0f, 0.500f);
        Articulo art4 = new Articulo("Sprite", "Una gaseosa", 1600.0f, 0.500f);
        Articulo art5 = new Articulo("Manza", "Una fruta", 110.0f, 0.400f);
        Articulo art6 = new Articulo("Pera", "Una fruta", 1100.0f, 0.400f);
        DetalleOrden detalle = new DetalleOrden();
        detalle.agregarArticulo(art1);
        detalle.agregarArticulo(art2);
        detalle.agregarArticulo(art3);
        detalle.agregarArticulo(art4);
        detalle.agregarArticulo(art5);
        detalle.agregarArticulo(art6);
        System.out.println(detalle);
      

    }
}