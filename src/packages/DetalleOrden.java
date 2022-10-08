package packages;
import java.util.*;

public class DetalleOrden {
  private ArrayList<Articulo> articulos;
  private int cantidad;

  public DetalleOrden() {
    this.articulos = new ArrayList<Articulo>();
    this.cantidad = articulos.size();
  }

  public float calcPrecio() {
    float precio = 0;
    for (Articulo articulo : articulos) {
      precio += articulo.getPrecio();
    }

    precio = (float) (precio * 1.19); // +19% de IVA
    return precio;
  };

  public float calcPrecioSinIVA() {
    float precio = 0;
    for (Articulo articulo : articulos) {
      precio += articulo.getPrecio();
    }

    return precio;
  };

  public float calcIVA() {
    float precio = 0;
    for (Articulo articulo : articulos) {
      precio += articulo.getPrecio();
    }

    precio = (float) (precio * 0.19); // 19% de IVA
    return precio;
  };

  public float calcPeso() {
    float pesoTotal = 0;
    for (Articulo articulo : articulos) {
      pesoTotal += articulo.getPeso();
    }

    return pesoTotal;
  };

  // Helper methods 
  public void agregarArticulo(Articulo a) {
    articulos.add(a);
    this.cantidad++;
  }

  public void eliminarArticulo(Articulo a) {
    if (!articulos.isEmpty()) {
      articulos.remove(a);
      this.cantidad--;
    }
  }

  public int getCantidad() {
    return cantidad;
  }
  

  @Override
  public String toString() {
    return "DetalleOrden [articulos=" + articulos + ", cantidad=" + cantidad + "]";
  }
}
