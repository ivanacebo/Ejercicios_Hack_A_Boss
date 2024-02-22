package clases;

public class Electrodomestico {

    private int cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;

    public Electrodomestico() {
    }

    public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca() + " Modelo: " + getModelo() +
                " y su consumo energético es de " + getConsumo());
    }
}
