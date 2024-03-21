package principal.votaciones.logica;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import principal.votaciones.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearVoto(Voto voto) {
        controlPersis.crearVoto(voto);
    }

    /**
     * Metodo para sumatorio de votos con un mapeo.
     * @return un mapeo con Partidos y la suma de estos
     */
    public Map<String, Long> traerVotos() {
        List<Voto> totalVotos = controlPersis.traerVotos();
        return totalVotos.stream()
                .collect(Collectors.groupingBy(Voto::getPartido, Collectors.counting()));
    }

}
