package clase;

import java.util.List;

public class Agente implements Runnable {

    private String nombre;
    private List<Llamada> llamadasEspera;
    private boolean seguirAtendiendo = true;

    public Agente() {
    }

    public Agente(String nombre, List<Llamada> llamadasEspera) {
        this.nombre = nombre;
        this.llamadasEspera = llamadasEspera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Llamada> getLlamadasEspera() {
        return llamadasEspera;
    }

    public void setLlamadasEspera(List<Llamada> llamadasEspera) {
        this.llamadasEspera = llamadasEspera;
    }

    public void detener() {
        seguirAtendiendo = false;
    }

    @Override
    public void run() {

        while (seguirAtendiendo) {
            Llamada llamada = null;
            synchronized (llamadasEspera) {
                if (!llamadasEspera.isEmpty()) {
                    llamada = llamadasEspera.remove(0);
                }
            }
            if (llamada != null) {
                System.out.println(nombre + " está atendiendo una llamada de " + llamada.getNombreCliente());
                try {
                    Thread.sleep((2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(nombre + " finalizó la llamada con " + llamada.getNombreCliente());
            }
        }
        System.out.println(nombre + " ha finalizado su jornada de trabajo.");
    }
}
