package clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RegistroMascota {

    private List<Mascota> registro;

    public RegistroMascota() {
        registro = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        registro.add(mascota);
    }

    public int cantidadTotalMascotas() {
        return registro.size();
    }

    public void buscarMascotaNombre(String nombre) {
        registro.stream()
                .filter(mascota -> mascota.getNombre().equals(nombre))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void buscarMastotaEspecie(String especie) {
        registro.stream()
                .filter(mascota -> mascota.getEspecie().equals(especie))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void generarDatosAleatorios (int cantidad) {
        Random random = new Random();
        String [] nombres = {"Luna", "Max", "Nala", "Simba", "Coco", "Kiara", "Rocky", "Bella", "Charlie", "Daisy"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(15) + 1;
            String especie = especies[random.nextInt(especies.length)];
            Mascota<String> mascota = new Mascota<>(nombre,edad,especie);
            agregarMascota(mascota);
        }
    }

}
