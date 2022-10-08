package packages;

public class Direccion {
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    //getters y setters
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return direccion;
    }

    @Override
    public String toString() {
        return "Direccion [direccion=" + direccion + "]";
    }
}
