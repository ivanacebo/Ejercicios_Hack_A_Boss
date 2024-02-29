package clases;

public class Reptil extends Animal{

    private double longitud;
    private String tipoEscamas;

    private String tipoVeneno;
    private String habitat;

    public Reptil() {
    }

    public Reptil(String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        super(nombre, edad, tipoPiel, tipoAlimentacion);
    }

    public Reptil(String nombre, int edad, String tipoPiel, String tipoAlimentacion, double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String saludar() {
        return "Hola, soy un reptil.";
    }
}
