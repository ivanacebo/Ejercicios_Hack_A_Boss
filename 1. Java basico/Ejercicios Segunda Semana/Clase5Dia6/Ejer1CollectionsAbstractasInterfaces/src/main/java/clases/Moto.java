package clases;

import java.util.Date;

public class Moto extends Vehiculo implements Combustion{

    private String cilindrada;
    private String tipoMotor;
    private int capacidadTanque;

    public Moto() {
    }

    public Moto(int id, String placa, String marca, String modelo, Date anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
    }

    public Moto(int id, String placa, String marca, String modelo, Date anio, double costo, String cilindrada, String tipoMotor, int capacidadTanque) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
        this.capacidadTanque = capacidadTanque;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public int antiguedadVehiculo() {
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear() + 1900;
        int anioVehiculo = getAnio().getYear() + 1900;
        return anioActual - anioVehiculo;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Rellenando combustible para la moto");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + getId() +
                ", placa " + getPlaca() +
                ", marca " + getMarca() +
                ", modelo " + getModelo() +
                ", año= " + getAnio() +
                ", costo " + getCosto() +
                ", cilindrada " + getCilindrada() +
                ", tipo de motor " + getTipoMotor() +
                ", capacidad de tanque " + getCapacidadTanque() +
                '}';
    }
}
