package packages.order;

import packages.customer.Direccion;

public class Boleta extends DocTributario {

    public Boleta(long numero, String rut, Direccion direccion) {
        super(numero, rut, direccion);
    }

}
