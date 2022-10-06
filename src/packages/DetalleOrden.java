package packages;
import java.util.*;

public class DetalleOrden {
  private ArrayList<Articulo> articulos;
  private int cantidad;


  public DetalleOrden(){
    articulos = new ArrayList<Articulo>();
    cantidad = 0;

  }

  public void agregarArticulo(Articulo a) {
    articulos.add(a);
    this.cantidad++;
  }

  public void eliminarArticulo(Articulo a) {
    articulos.remove(a);
    this.cantidad--;
  }

  public int getCantidad() {
    return cantidad;
  }
  

  @Override
  public String toString() {
    return "DetalleOrden [articulos=" + articulos + ", cantidad=" + cantidad + "]";
  }
}
