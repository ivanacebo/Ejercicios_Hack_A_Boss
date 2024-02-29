package clases;

public class Ave extends Animal{

    private String envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave() {
    }

    public Ave(String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        super(nombre, edad, tipoPiel, tipoAlimentacion);
    }

    public Ave(String nombre, int edad, String tipoPiel, String tipoAlimentacion, String envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public String getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(String envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public String saludar() {
        return "Hola, soy un ave.";
    }
}
