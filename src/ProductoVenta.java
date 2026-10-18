public class ProductoVenta extends Producto {
    private float precioVenta;

    public ProductoVenta(int idProducto, String nombre, int precioCompra, int stockActual, int stockMinimo, float precioVenta) {
        super(idProducto, nombre, precioCompra, stockActual, stockMinimo);
        this.precioVenta = precioVenta;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String mostrarTipo() {
        return "Producto de venta";
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo: " + mostrarTipo());
        System.out.println("Precio venta: " + precioVenta);
    }
}