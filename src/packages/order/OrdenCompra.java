package packages.order;

import java.util.*;

import packages.cart.Articulo;
import packages.cart.DetalleOrden;
import packages.checkout.Efectivo;
import packages.checkout.Pago;
import packages.customer.Cliente;

public class OrdenCompra {
    private DocTributario docTributario;
    private Date fecha;
    private String estado;
    private Cliente cliente;
    private ArrayList<DetalleOrden> detallesOrdenes;
    private ArrayList<Pago> pagos;

    public OrdenCompra(Cliente cliente) {
        this.detallesOrdenes = new ArrayList<DetalleOrden>();
        this.docTributario = null;
        this.fecha = new Date();
        this.estado = "Pendiente";
        this.cliente = cliente;
        this.pagos = new ArrayList<Pago>();
    }

    // Methods
    public float calcPrecioSinIVA() {
        if (!detallesOrdenes.isEmpty()) {
            float precioSinIVA = 0;
            for (DetalleOrden detalleOrden1 : detallesOrdenes)
                precioSinIVA += detalleOrden1.calcPrecioSinIVA();

            return precioSinIVA;

        } else
            return -1;
    }

    public float calcIVA() {
        if (!detallesOrdenes.isEmpty()) {
            float IVA = 0;
            for (DetalleOrden detalleOrden1 : detallesOrdenes)
                IVA += detalleOrden1.calcIVA();

            return IVA;

        } else
            return -1;
    }

    public float calcPrecio() {
        if (!detallesOrdenes.isEmpty()) {
            float precio = 0;
            for (DetalleOrden detalleOrden1 : detallesOrdenes)
                precio += detalleOrden1.calcPrecio();

            return precio;

        } else
            return -1;
    }

    public float calcPeso() {
        if (!detallesOrdenes.isEmpty()) {
            float peso = 0;
            for (DetalleOrden detalleOrden1 : detallesOrdenes)
                peso += detalleOrden1.calcPeso();
            return peso;
        } else
            return -1;
    }


    
    public void finalizarOrden(String tipoDocTributario) {
        if (tipoDocTributario.toLowerCase().equals("boleta")) {
            System.out.println("Creando boleta...");
            float total = calcPrecio();
            this.estado = "Finalizada";
            

            long nroBoleta = fecha.getTime() / 1000;
            this.docTributario = new Boleta(nroBoleta, cliente.getRut(), cliente.getDireccion());

            if (pagos.isEmpty()) { // Comprobando pagos
                System.out.println("No se ha realizado ningun pago");

            } else {
                // Si el pago por completo es en efectivo
                if (pagos.stream().allMatch(pago -> pago instanceof Efectivo)) {
                    float totalPagos = 0;
                    for (Pago pago : pagos)
                        totalPagos += pago.getMonto();

                    if (totalPagos >= total) {
                        System.out.println("Pago realizado con exito");
                        System.out.println("Su cambio es de: " + (totalPagos - total));

                    } else System.out.println("No tiene suficiente dinero");
                }else{
                
                    float totalPagos = 0;
                    for (Pago pago : pagos) {
                        totalPagos += pago.getMonto();
                    }
                    if (totalPagos < total) {
                        System.out.println("No se ha realizado el pago total");
                    } else {
                        System.out.println("Pago realizado");
                    }
                }
            }

        } else if (tipoDocTributario.toLowerCase().equals("factura")) {
            float total = calcPrecio();
            this.estado = "Finalizada";
            
            long nroFactura = fecha.getTime() / 1000;
            this.docTributario = new Factura(nroFactura, cliente.getRut(), cliente.getDireccion());

            if (pagos.isEmpty()) {
                System.out.println("No se ha realizado ningun pago");

            } else {
                // Si el pago por completo es en efectivo
                if (pagos.stream().allMatch(pago -> pago instanceof Efectivo)) {
                    float totalPagos = 0;
                    for (Pago pago : pagos)
                        totalPagos += pago.getMonto();

                    if (totalPagos >= total) {
                        System.out.println("Pago realizado con exito");
                        System.out.println("Su cambio es de: " + (totalPagos - total));

                    } else System.out.println("No tiene suficiente dinero");
                    
                }else{

                    float totalPagos = 0;
                    for (Pago pago : pagos) {
                        totalPagos += pago.getMonto();
                    }
                    if (totalPagos < total) {
                        System.out.println("No se ha realizado el pago total");
                    } else {
                        System.out.println("Pago realizado");
                    }
                }
            }

        }
    }


    // Getters and Setters
    public ArrayList<DetalleOrden> getDetallesOrdenes() {
        return detallesOrdenes;
    }


    public void addPago(Pago pago) {
        this.pagos.add(pago);
    }

    public Pago[] getPagos() {
        return pagos.toArray(new Pago[pagos.size()]);
    }

    public void addProducto(Articulo articulo, int cantidad) {
        DetalleOrden detalleOrden = new DetalleOrden(articulo, cantidad);
        this.detallesOrdenes.add(detalleOrden);
    }

    public void setDocTributario(DocTributario docTributario) {
        this.docTributario = docTributario;
    }

    public DocTributario getDocTributario() {
        return docTributario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "OrdenCompra [cliente=" + this.cliente + ", docTributario=" + this.docTributario + ", estado=" + this.estado
                + ", fecha=" + this.fecha + "]";
    }

}
