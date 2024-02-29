package main.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.logica.Plato;
import main.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    PlatoJpaController platojpa = new PlatoJpaController();

    public void crearPlaro(Plato plato) {
        platojpa.create(plato);
    }

    public void eliminarPlato(int id) {
        try {
            platojpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Plato> traerPlatos() {
        return platojpa.findPlatoEntities();
    }

    public Plato traerPlato(int id) {
        return platojpa.findPlato(id);
    }

    public void editarPlato(Plato plato) {
        try {
            platojpa.edit(plato);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
