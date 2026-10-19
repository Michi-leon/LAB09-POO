public abstract class Producto {
    private  int idProducto;
    private String nombre;
    private float precioCompra;
    private int stockActual;
    private int stockMinimo;

    public Producto(int idProducto,String nombre, float precioCompra, int stockActual, int stockMinimo) {
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

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
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
    public boolean tieneStockBajo() {
        return stockActual <= stockMinimo;
    }
    public abstract String mostrarTipo();

    public void imprimirInformacion(){
        System.out.println("ID: "+idProducto);
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio compra: "+precioCompra);
        System.out.println("Stock actual: "+stockActual);
        System.out.println("Stock minimo: "+stockMinimo);
    }
}