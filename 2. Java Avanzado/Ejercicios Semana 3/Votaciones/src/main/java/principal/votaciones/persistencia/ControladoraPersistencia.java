package principal.votaciones.persistencia;

import java.util.List;
import principal.votaciones.logica.Voto;

public class ControladoraPersistencia {
    
    VotoJpaController controlVoto = new VotoJpaController();
    
    public void crearVoto (Voto voto) {
        controlVoto.create(voto);
    }
    
    public List<Voto> traerVotos () {
        return controlVoto.findVotoEntities();
    }
}
