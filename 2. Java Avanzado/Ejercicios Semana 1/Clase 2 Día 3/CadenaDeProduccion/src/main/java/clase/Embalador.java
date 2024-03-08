package clase;

import java.util.List;

public class Embalador implements Runnable{

    private List<Producto> embalaje;

    public Embalador(List<Producto> embalaje) {
        this.embalaje = embalaje;
    }

    @Override
    public void run() {
        for (Producto producto : embalaje) {
            System.out.println("Embalador embala producto " + producto.getId());
        }
    }
}
