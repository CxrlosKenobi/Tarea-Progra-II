package packages.cart;

public class DetalleOrden {
  private Articulo articulo;
  private int cantidad;

  public DetalleOrden(Articulo a, int cant) {
    this.articulo = a;
    this.cantidad = cant;
  }

  public float calcPrecio() {
    float total;
    total = this.cantidad * this.articulo.getPrecio();
      
    return (float) (total * 1.19);
  };

  public float calcPrecioSinIVA() {
    float total;
    total = this.cantidad * this.articulo.getPrecio();

    return total;
  };

  public float calcIVA() {
    float total;
    total = this.cantidad * this.articulo.getPrecio();

    return (float) (total * 0.19);
  };

  public float calcPeso() {
    float peso;
    peso = this.cantidad * this.articulo.getPeso();
    
    return peso;
  };


  public int getCantidad() {
    return cantidad;
  }

  @Override
  public String toString() {
    return "DetalleOrden [articulo=" + articulo + ", cantidad=" + cantidad + "]";
  }
}
