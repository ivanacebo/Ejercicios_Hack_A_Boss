package clases;

import java.util.Date;

public class Auto extends Vehiculo implements Electrico{

    private int capacidadBateria;

    private int autonomia;

    public Auto() {
    }

    public Auto(int id, String placa, String marca, String modelo, Date anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
    }

    public Auto(int id, String placa, String marca, String modelo, Date anio, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public int antiguedadVehiculo() {
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear() + 1900;
        int anioVehiculo = getAnio().getYear() + 1900;
        return anioActual - anioVehiculo;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energia");
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
                ", capadicad de bateria " + getCapacidadBateria() +
                ", autonomia " + getAutonomia() +
                '}';
    }

}
