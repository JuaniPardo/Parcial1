package miEmpresa;

public class Compra {
    private String items;           //var de instncia de referencia
    private Vendedor vendedor;      //var de instancia de referencia
    private Cliente cliente;        //var de instancia de referencia
    private double monto;           //var de instancia primitiva
    private MetPago metodoPago;      //var de instancia de referencia


    //#########################
    //### Getters y Setters ###
    //#########################

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public MetPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    //#########################
    //####   Constructor   ####
    //#########################


    public Compra(String items,         //var locales
                  Vendedor vendedor,
                  Cliente cliente,
                  double monto,MetPago metodoPago) {
        this.items = items;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.cliente.setEstado("Activo");
        this.cliente.setTotalCompras(this.cliente.getTotalCompras()+monto);
    }


    @Override
    public String toString() {
        return  "=========================\n" +
                "Compra:\n-----------\n" +
                "Items: \t\t\t" + items + "\n" +
                "Vendedor: \t\t" + vendedor.getNombre() + " " + vendedor.getApellido() +
                "\nComisión: \t\t" + (monto* vendedor.getComision()) +
                "\nCliente: \t\t" + cliente.getNombre() + " " + cliente.getApellido() +
                "\nMonto: \t\t\t" + monto +
                "\n" + metodoPago +
                "=========================";
    }
}
