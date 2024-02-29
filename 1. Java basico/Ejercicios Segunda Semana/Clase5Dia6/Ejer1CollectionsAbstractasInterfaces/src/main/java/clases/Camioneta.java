package clases;

import java.util.Date;

public class Camioneta extends Vehiculo implements Combustion{

    private int capacidadTanque;
    private int consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(int id, String placa, String marca, String modelo, Date anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
    }

    public Camioneta(int id, String placa, String marca, String modelo, Date anio, double costo, int capacidadTanque, int consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
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
        System.out.println("Rellenando tanque de combustible");
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
                ", capadicad de tanque " + getCapacidadTanque() +
                ", consumo de combustible " + getConsumoCombustible() +
                '}';
    }
}
