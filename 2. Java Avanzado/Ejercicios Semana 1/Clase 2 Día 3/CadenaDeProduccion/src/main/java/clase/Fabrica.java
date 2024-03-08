package clase;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private List<Producto> ensamblaje = new ArrayList<>();
    private List<Producto> controlCalidad = new ArrayList<>();
    private List<Producto> embalaje = new ArrayList<>();

    public void iniciarProduccion () {
        Thread ensamblador = new Thread(new Ensamblador(embalaje, controlCalidad));
        Thread inspectorCalidad = new Thread(new Inspector (controlCalidad, embalaje));
        Thread embalador = new Thread(new Embalador (embalaje));

        ensamblador.start();
        inspectorCalidad.start();
        embalador.start();
    }

}
