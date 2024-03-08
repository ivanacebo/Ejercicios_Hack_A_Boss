package clase;

import java.util.List;

public class Ensamblador implements Runnable{

    private List<Producto> ensamblaje;
    private List<Producto> controlCalidad;

    public Ensamblador(List<Producto> ensamblaje, List<Producto> controlCalidad) {
        this.ensamblaje = ensamblaje;
        this.controlCalidad = controlCalidad;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Producto producto = new Producto(i);
            ensamblaje.add(producto);
            System.out.println("E. produce producto " + producto.getId());
        }
    }
}
