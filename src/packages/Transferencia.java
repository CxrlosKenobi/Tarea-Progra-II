package packages;

public class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(float monto, String banco, String numCuenta){
        super(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
      }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
