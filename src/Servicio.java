public class Servicio {
    private int idServicio;
    private String nombre;
    private double precioHabitual;

    public Servicio(int idServicio, String nombre,double precioHabitual) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.precioHabitual = precioHabitual;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioHabitual() {
        return precioHabitual;
    }

    public void setPrecioHabitual(double precioHabitual) {
        this.precioHabitual = precioHabitual;
    }
}