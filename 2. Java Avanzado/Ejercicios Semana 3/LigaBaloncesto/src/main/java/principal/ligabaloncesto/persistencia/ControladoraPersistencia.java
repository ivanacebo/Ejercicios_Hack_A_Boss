package principal.ligabaloncesto.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.ligabaloncesto.logica.Equipo;
import principal.ligabaloncesto.logica.Partido;
import principal.ligabaloncesto.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    EquipoJpaController controlEquipo = new EquipoJpaController();
    PartidoJpaController controlPartido = new PartidoJpaController();
    
    /* EQUIPO */
    public void crearEquipo (Equipo equipo) {
        controlEquipo.create(equipo);
    }
    
    public List<Equipo> traerEquipos () {
        return controlEquipo.findEquipoEntities();
    }
    
    public void eliminarEquipo(Long id) {
        try {
            controlEquipo.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarEquipo(Equipo equipo) {
        try {
            controlEquipo.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Equipo obtenerEquipo (Long id) {
        return controlEquipo.findEquipo(id);
    }
    
    /* PARTIDO */
    public void crearPartido(Partido partido) {
        controlPartido.create(partido);
    }
    
    public List<Partido> traerPartidos() {
        return controlPartido.findPartidoEntities();
    }
    
    public void eliminarPartido(Long id) {
        try {
            controlPartido.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarPartido(Partido partido) {
        try {
            controlPartido.edit(partido);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
