package clase;

public class Inventario {

    private String nombreProducto;
    private double precio;
    private int cantidadDisponible;

    public Inventario() {
    }

    public Inventario(String nombreProducto, double precio, int cantidadDisponible) throws InventarioException{
        if (nombreProducto.trim().isEmpty()) {
            throw new InventarioException("Un producto siempre tiene que tener un nombre");
        }
        this.nombreProducto = nombreProducto;
        if (precio <= 0) {
            throw  new InventarioException("El precio del producto no puede ser menor que 0");
        }
        this.precio = precio;

        if (cantidadDisponible <= 0) {
            System.out.println("La cantidad disponible del producto no puede ser 0.");
        }
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}
