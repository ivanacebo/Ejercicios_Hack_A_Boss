package principal.ligabaloncesto.logica;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Partido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    
    @OneToOne
    private Equipo equipoLocal;
    @OneToOne
    private Equipo equipoVisitante;
    
    private Integer resultadoEquipoLocal;
    private Integer resultadoEquipoVisitante;

    public Partido() {
    }

    public Partido(Date fecha, Equipo equipoVisitante, Integer resultadoEquipoLocal, Integer resultadoEquipoVisitante) {
        this.fecha = fecha;
        this.equipoVisitante = equipoVisitante;
        this.resultadoEquipoLocal = resultadoEquipoLocal;
        this.resultadoEquipoVisitante = resultadoEquipoVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Integer getResultadoEquipoLocal() {
        return resultadoEquipoLocal;
    }

    public void setResultadoEquipoLocal(Integer resultadoEquipoLocal) {
        this.resultadoEquipoLocal = resultadoEquipoLocal;
    }

    public Integer getResultadoEquipoVisitante() {
        return resultadoEquipoVisitante;
    }

    public void setResultadoEquipoVisitante(Integer resultadoEquipoVisitante) {
        this.resultadoEquipoVisitante = resultadoEquipoVisitante;
    }
    
    public String getFechaFormateada(){
        SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/mm/yyyy");
        return fechaFormateada.format(fecha);
    }

    @Override
    public String toString() {
        return "Partido{" + "id=" + id + ", fecha=" + fecha + ", "
                + "equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", "
                + "resultadoEquipoLocal=" + resultadoEquipoLocal + ", resultadoEquipoVisitante=" + resultadoEquipoVisitante + '}';
    }
    
    
}
