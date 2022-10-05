package packages;
public class Cliente {
  private String nombre;
  private String rut;
  public Cliente(){}

  //getters y setters
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return nombre;
  }
  public void setRut(String rut){
    this.rut = rut;
  }
  public String getRut(){
    return rut;
  }


  @Override
  public String toString() {
    return "Cliente [nombre=" + nombre + ", rut=" + rut + "]";
  }
}
