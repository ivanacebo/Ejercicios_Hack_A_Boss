package org.example;

import clase.Agente;
import clase.Llamada;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Llamada> llamadasEspera = new ArrayList<>();

        // Creamos algunos agentes
        Agente agente1 = new Agente("Agente 1", llamadasEspera);
        Agente agente2 = new Agente("Agente 2", llamadasEspera);

        // Creamos algunos clientes y simulamos algunas llamadas en espera
        llamadasEspera.add(new Llamada("Cliente 1"));
        llamadasEspera.add(new Llamada("Cliente 2"));
        llamadasEspera.add(new Llamada("Cliente 3"));

        // Creamos hilos para cada agente
        Thread hiloAgente1 = new Thread(agente1);
        Thread hiloAgente2 = new Thread(agente2);

        // Iniciamos los hilos de los agentes
        hiloAgente1.start();
        hiloAgente2.start();

        try {
            // Esperamos un tiempo para simular la duración del proceso
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Detenemos la simulación al detener los agentes
        agente1.detener();
        agente2.detener();
    }
}
