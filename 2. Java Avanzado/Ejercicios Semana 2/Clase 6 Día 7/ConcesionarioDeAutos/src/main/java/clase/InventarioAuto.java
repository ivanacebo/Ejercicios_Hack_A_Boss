package clase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InventarioAuto<T extends Auto> {

    private List<T> autos;

    public InventarioAuto() {
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(T auto) {
        autos.add(auto);
    }

    // Método para buscar autos por marca
    public List<T> buscarAutosPorMarca(String marca) {
        return buscarAutosConFiltro(auto -> auto.getMarca().equalsIgnoreCase(marca));
    }

    // Método para buscar autos por año
    public List<T> buscarAutosPorAno(String ano) {
        return buscarAutosConFiltro(auto -> auto.getAno().equals(ano));
    }

    public double calcularValorTotalInventario() {
        return autos.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();
    }

    // Método genérico para buscar autos con un predicado
    private List<T> buscarAutosConFiltro(Predicate<T> predicate) {
        return autos.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
