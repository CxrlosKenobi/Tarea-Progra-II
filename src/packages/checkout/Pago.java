package packages.checkout;
import java.util.*;

public abstract class Pago {
    private float monto;
    private Date fecha;
   
    public Pago (float cantidad) {
        this.monto = cantidad;
        this.fecha = new Date();
    }

    public float getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Pago [fecha=" + fecha + ", monto=" + monto + ", tipo=" + this.getClass().getSimpleName() + "]";
    }
}
