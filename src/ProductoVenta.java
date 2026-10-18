public class ProductoVenta extends Producto {
    private double precioVenta;

    public ProductoVenta(int idProducto, String nombre, int precioCompra,
                         int stockActual, int stockMinimo, double precioVenta) {
        super(idProducto, nombre, precioCompra, stockActual, stockMinimo);
        this.precioVenta = precioVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String mostrarTipo() {
        return "Producto de venta";
    }

    @Override
    public void imprimirInfromacion() {
        super.imprimirInfromacion();
        System.out.println("Tipo: " + mostrarTipo());
        System.out.println("Precio venta: " + precioVenta);
    }
}