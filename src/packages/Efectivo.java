package packages;

public class Efectivo extends Pago {
    public Efectivo(float monto){
        super(monto);
    }
    public float calcDevolucion(){

        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
