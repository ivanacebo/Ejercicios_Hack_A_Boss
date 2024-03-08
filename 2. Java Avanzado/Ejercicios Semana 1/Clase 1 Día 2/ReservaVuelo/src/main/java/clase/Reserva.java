package clase;

public class Reserva {

    private int id;
    private String nombre;
    private String destino;
    private String fechaViaje;
    private int numeroAsientosDeseados;
    private int numeroAsientosDisponibles = 100;

    public Reserva() {
    }

    public Reserva(int id, String nombre, String destino, String fechaViaje, int numeroAsientosDeseados) throws ReservaInvalidaException{
        this.id = id;
        if (nombre.trim().isEmpty() || destino.trim().isEmpty()) {
            throw new ReservaInvalidaException("Los datos no pueden ser inválidos.");
        }
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        if (numeroAsientosDeseados > numeroAsientosDisponibles) {
            throw new ReservaInvalidaException("La cantidad de asientos que intenta adquirir es superior a la disponible.");
        }
        this.numeroAsientosDeseados = numeroAsientosDeseados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getNumeroAsientosDeseados() {
        return numeroAsientosDeseados;
    }

    public void setNumeroAsientosDeseados(int numeroAsientosDeseados) {
        this.numeroAsientosDeseados = numeroAsientosDeseados;
    }

    public int getNumeroAsientosDisponibles() {
        return numeroAsientosDisponibles;
    }

    public void setNumeroAsientosDisponibles(int numeroAsientosDisponibles) {
        this.numeroAsientosDisponibles = numeroAsientosDisponibles;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaViaje='" + fechaViaje + '\'' +
                ", numeroAsientosDeseados=" + numeroAsientosDeseados +
                ", numeroAsientosDisponibles=" + numeroAsientosDisponibles +
                '}';
    }
}
