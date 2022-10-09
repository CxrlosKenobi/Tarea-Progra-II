package packages.customer;

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
    return this.nombre;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public String getRut() {
    return this.rut;
  }
  public Direccion getDireccion() {
    return this.direccion;
  }

  @Override
  public String toString() {
    return "Cliente [nombre=" + this.nombre + ", rut=" + this.rut + "]" + "\n> " + this.direccion;
  }
}
