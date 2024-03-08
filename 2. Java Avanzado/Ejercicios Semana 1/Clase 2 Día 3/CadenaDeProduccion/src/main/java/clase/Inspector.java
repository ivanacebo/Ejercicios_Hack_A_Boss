package clase;

import java.util.List;

public class Inspector implements Runnable{

    private List<Producto> controlCalidad;
    private List<Producto> embalaje;

    public Inspector(List<Producto> controlCalidad, List<Producto> embalaje) {
        this.controlCalidad = controlCalidad;
        this.embalaje = embalaje;
    }

    @Override
    public void run() {
        for (Producto producto : controlCalidad) {
            System.out.println("I. revisa producto " + producto.getId());
            embalaje.add(producto);
            System.out.println("Producto " + producto.getId() + " pasa control");
        }
    }
}
