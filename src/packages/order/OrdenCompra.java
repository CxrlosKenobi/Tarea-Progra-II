package packages.order;

import java.util.*;
import java.util.stream.Collectors;

import packages.cart.*;
import packages.checkout.*;
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

    public float calcPagos() {
        float total = this.calcPrecio();

        if (pagos.isEmpty())
            return -1f;

        float totalPagos = 0;
        if (pagos.stream().allMatch(pago -> pago instanceof Efectivo)) {
            // Si el pago por completo es en efectivo
            for (Pago pago : pagos)
                totalPagos += pago.getMonto();

            if (totalPagos < total) {
                return -1f;
            } else
                return totalPagos;

        } else if (pagos.stream().anyMatch(pago -> pago instanceof Efectivo)) {
            // Si el pago es parcial en efectivo
            for (Pago pago : pagos)
                totalPagos += pago.getMonto();

            if (totalPagos < total) {
                return -1f;
            } else
                return totalPagos;

        } else {
            for (Pago pago : pagos)
                totalPagos += pago.getMonto();

            if (totalPagos < total) {
                return -1f;
            } else
                return 0f;
        }
    }

    public float calcVuelto() {
        float total = this.calcPrecio();
        float totalPagos = this.calcPagos();

        if (((totalPagos - total) < 0) || (totalPagos == -1f)) {
            return 0.0f;

        } else {
            return totalPagos - total;
        }
    }

    public void finalizarOrden(String tipoDocTributario) {
        if (tipoDocTributario.toLowerCase().equals("boleta")) {
            this.estado = "Finalizada";

            long nroBoleta = fecha.getTime() / 1000;
            this.docTributario = new Boleta(nroBoleta, cliente.getRut(), cliente.getDireccion());
            this.calcPagos();

        } else if (tipoDocTributario.toLowerCase().equals("factura")) {
            this.estado = "Finalizada";

            long nroFactura = fecha.getTime() / 1000;
            this.docTributario = new Factura(nroFactura, cliente.getRut(), cliente.getDireccion());
            this.calcPagos();
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
        String ordenCompleta = "\n\tOrden de Compra (" + this.estado + "):\n\n" +
                "> " + this.docTributario + "\n" +
                "> " + this.cliente + "\n" +

                "\n\t" + "Detalles de la orden:\n\n" +
                // Imprimimos cada metodo .toString para cada DetalleOrden
                "- " + detallesOrdenes.stream().map(DetalleOrden::toString).collect(Collectors.joining("\n- ")) +

                "\n\n  Subtotal: $" + this.calcPrecioSinIVA() + "\n" +
                "  IVA: $" + this.calcIVA() + "\n" +
                "> Total: $" + this.calcPrecio() + "\n\n" +
                "- " + pagos.stream().map(Pago::toString).collect(Collectors.joining("\n- ")) + "\n";

        if (this.calcPagos() == -1f) {
            ordenCompleta += "\n> Pago insuficiente, vuelva a intentarlo.\n";

        } else {
            ordenCompleta += "\n  Vuelto: $" + this.calcVuelto() + "\n";
        }

        return ordenCompleta;
    }
}
