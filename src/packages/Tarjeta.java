package packages;

public class Tarjeta extends Pago {
    private String numTransaccion;
    private String tipo;

    public Tarjeta(float monto){
        super(monto);
    }
    
    //getters and setters
    public String getNumTransaccion() {
        return numTransaccion;
    }
    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
