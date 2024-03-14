package clase;

import java.util.ArrayList;
import java.util.List;

public class Directorio {

    private Integer id;
    private String descripcion;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    public Directorio(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", subdirectorios=" + subdirectorios +
                ", archivos=" + archivos +
                '}';
    }


}
