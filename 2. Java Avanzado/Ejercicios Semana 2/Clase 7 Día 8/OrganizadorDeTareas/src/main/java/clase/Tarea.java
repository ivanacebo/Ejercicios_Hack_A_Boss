package clase;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea() {
        this.subtareas = new ArrayList<>();
    }

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    public void mostrarEstructura(String prefijo) {
        System.out.println(prefijo + nombre);
        for (Tarea subtarea : subtareas) {
            subtarea.mostrarEstructura(prefijo + "|-- ");
        }
    }
}
