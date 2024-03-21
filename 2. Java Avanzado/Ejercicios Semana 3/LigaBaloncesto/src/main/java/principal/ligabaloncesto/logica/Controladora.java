package principal.ligabaloncesto.logica;

import java.util.List;
import principal.ligabaloncesto.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    /* EQUIPO*/
    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }
    
    public List<Equipo> traerEquipos () {
        return controlPersis.traerEquipos();
    }
    
    public void eliminarEquipo (Long id) {
        controlPersis.eliminarEquipo(id);
    }
    
    public void editarEquipo (Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }
    
    /* PARTIDO */
    public void crearPartido(Partido partido, Long idEquipoLocal, Long idEquipoVisitante) {
        Equipo equipoLocal = controlPersis.obtenerEquipo(idEquipoLocal);
        Equipo equipoVisitante = controlPersis.obtenerEquipo(idEquipoVisitante);
        
        partido.setEquipoLocal(equipoLocal);
        partido.setEquipoVisitante(equipoVisitante);
        
        controlPersis.crearPartido(partido);
    }
    
    public void eliminarPartido (Long id) {
        controlPersis.eliminarPartido(id);
    }
    
    public void editarPartido(Partido partido) {
        controlPersis.editarPartido(partido);
    }
    
    public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }
}
