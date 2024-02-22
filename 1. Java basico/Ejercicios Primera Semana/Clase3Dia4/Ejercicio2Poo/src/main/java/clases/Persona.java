package clases;

public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private String dirección;
    private String numeroTelefono;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String dirección, String numeroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dirección = dirección;
        this.numeroTelefono = numeroTelefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
