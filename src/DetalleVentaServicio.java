public class DetalleVentaServicio extends DetalleVenta {
    private Servicio servicio;

    public DetalleVentaServicio(int idDetalle, int cantidad,double precioUnitario, double descuento, Servicio servicio) {
        super(idDetalle, cantidad, precioUnitario, descuento);
        this.servicio = servicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public double calcularSubtotal() {
        return (getCantidad() * getPrecioUnitario())- getDescuento();
    }
}