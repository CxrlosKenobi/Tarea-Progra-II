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
