package packages;

public class Efectivo extends Pago {
    public Efectivo(float monto){
        super(monto);
    }
    public float calcDevolucion(float total){
        float saldo = getMonto();
        if(saldo>total){
            if(saldo==total){
                System.out.println("No hay devolucion");
                return 0;
            }
            else{
                System.out.println("Su cambio es de: "+(saldo-total));
                return saldo-total;
            }
        }else{
            System.out.println("No tiene suficiente dinero");
            return 0;
        }
    }
}
