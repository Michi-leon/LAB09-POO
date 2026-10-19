public class DetalleVentaProducto extends DetalleVenta {
    private Producto producto;

    public DetalleVentaProducto(int idDetalle, int cantidad,double precioUnitario, double descuento, Producto producto) {
        super(idDetalle, cantidad, precioUnitario, descuento);
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public double calcularSubtotal() {
        return (getCantidad() * getPrecioUnitario())- getDescuento();
    }
}