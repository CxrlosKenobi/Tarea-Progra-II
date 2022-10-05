import packages.*;
import java.util.*;

public class App {
    public static void main(String[] args){
        OrdenCompra oc = new OrdenCompra();
        System.out.println(oc);

    }
}

class Direccion{

}

class DocTributario{

}

class Boleta{

}

class Factura{

}

abstract class Pago{
    private float monto;
    private Date fecha;

}

class Efectivo extends Pago{
    public Efectivo(){}
    public float calcDevolucion(){
        return 0;
    }

}



class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(){  }
    
}

class Tarjeta extends Pago{


}


