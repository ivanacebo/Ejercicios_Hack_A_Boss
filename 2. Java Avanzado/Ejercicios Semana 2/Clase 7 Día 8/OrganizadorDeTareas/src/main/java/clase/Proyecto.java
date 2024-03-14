package clase;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private Integer id;
    private String descripcion;
    private List<Proyecto> subdirectorios;

    public Proyecto(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.subdirectorios = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Proyecto> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Proyecto> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

}
