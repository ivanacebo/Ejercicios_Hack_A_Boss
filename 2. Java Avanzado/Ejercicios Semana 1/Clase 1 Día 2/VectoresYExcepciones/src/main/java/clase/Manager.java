package clase;

import java.util.Vector;

public class Manager {

    private Vector<String> valores;

    public Manager(int size) {
        valores = new Vector<>(size); // Crear un vector de tamaño fijo
    }

    public void introducirDato (String dato) {
        valores.add(dato);
    }

    public String obtenerDato(int indice) {
        try {
            return valores.get(indice);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posición seleccionada no existe");
            return "Error: Estas intentando acceder a una posición invalida del vector.";
        }

    }
}
