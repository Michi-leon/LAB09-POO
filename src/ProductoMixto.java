public class ProductoMixto extends Producto {
    private float precioVenta;

    public ProductoMixto(int idProducto, String nombre, int precioCompra, int stockActual, int stockMinimo, float precioVenta) {
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
        return "producto mixto";
    }
    @Override
    public void imprimirInfromacion() {
        super.imprimirInfromacion();
        System.out.println("Tipo: " + mostrarTipo());
        System.out.println("Precio venta: " + precioVenta);
    }
}