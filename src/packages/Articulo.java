package packages;

public class Articulo {
  private float peso;
  private String nombre;
  private String descripcion;
  private float precio;

  // Inicializo los valores en el constructor
  public Articulo() {
    peso = 0;
    nombre = "";
    descripcion = "";
    precio = 0;
  }

  public Articulo(String nombre, String descripcion, float precio, float peso) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.peso = peso;
  }

  public float getPrecio() {
    return this.precio;
  }

  public float getPeso() {
    return this.peso;
  }

  @Override
  public String toString() {
    return "Articulo [descripcion=" + descripcion + ", nombre=" + nombre + ", peso=" + peso + ", precio=" + precio
        + "]";
  }
}