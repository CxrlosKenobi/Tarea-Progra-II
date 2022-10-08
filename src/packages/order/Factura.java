package packages.order;

import packages.customer.Direccion;

public class Factura extends DocTributario {

  public Factura(long numero, String rut, Direccion direccion) {
    super(numero, rut, direccion);
  }

}
