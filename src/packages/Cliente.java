package packages;

public class Cliente {
  private String nombre;
  private String rut;
  private Direccion direccion;

  public Cliente(String nombre, String rut, Direccion direccion) {
    this.direccion = direccion;
    this.nombre = nombre;
    this.rut = rut;
  }

  // getters y setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public String getRut() {
    return rut;
  }
  public Direccion getDireccion() {
    return direccion;
  }

  @Override
  public String toString() {
    return "Cliente [nombre=" + nombre + ", rut=" + rut + "]";
  }
}
