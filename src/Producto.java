public abstract class Producto {
    protected int idProducto;
    protected String nombre;
    protected int precioCompra;
    protected int stockActual;
    protected int stockMinimo;

    public Producto(int idProducto,String nombre, int precioCompra, int stockActual, int stockMinimo) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
    public abstract String mostrarTipo();

    public void imprimirInfromacion(){
        System.out.println("ID: "+idProducto);
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio compra: "+precioCompra);
        System.out.println("Stock actual: "+stockActual);
        System.out.println("Stock minimo: "+stockMinimo);
    }
}