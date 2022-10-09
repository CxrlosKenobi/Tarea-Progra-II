package packages.checkout;

public class Tarjeta extends Pago {
    private String numTransaccion;
    private String tipo;

    public Tarjeta(float monto, String numTransaccion, String tipo) {
        super(monto);
        this.numTransaccion = numTransaccion;
        this.tipo = tipo;
    }
}
