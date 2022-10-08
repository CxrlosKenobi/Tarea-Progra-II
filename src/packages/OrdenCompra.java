package packages;

import java.util.*;

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


    // Con este metodo se finaliza la orden de compra y se genera el documento tributario
    public void finalizarCompra(int a) {
        if (a == 1) {
            this.estado = "Finalizada";
            this.docTributario = new Boleta();

        } else {
            this.estado = "Finalizada";
            this.docTributario = new Factura();
        }
    }


    // Getters and Setters
    public void addPago(Pago pago) {
        this.pagos.add(pago);
    }

    public Pago[] getPagos() {
        return pagos.toArray(new Pago[pagos.size()]);
    }

    public void addProducto(DetalleOrden detallesOrdenes) {
        this.detallesOrdenes.add(detallesOrdenes);
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
        return "OrdenCompra [cliente=" + cliente + ", docTributario=" + docTributario + ", estado=" + estado
                + ", fecha=" + fecha + "]";
    }

}
