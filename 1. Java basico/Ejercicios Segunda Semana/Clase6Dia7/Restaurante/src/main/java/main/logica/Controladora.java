package main.logica;

import java.util.List;
import main.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();
    public List<Plato> traerPlatos() {
        return control.traerPlatos();
    }
    

    public void crearPlato(Plato plato) {
        control.crearPlaro(plato);
    }

    public void eliminarPlato(int id) {
        control.eliminarPlato(id);
    }

    public Plato traerPlato(int id) {
        return control.traerPlato(id);
    }

    public void editarPlato(Plato plato) {
        control.editarPlato(plato);
    }
}
