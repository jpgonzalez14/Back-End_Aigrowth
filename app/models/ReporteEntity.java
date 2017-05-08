package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Sofia on 3/05/17.
 */

@Entity
@Table(name="reporteEntity")
public class ReporteEntity extends Model
{
    public final static String MAS_AGUA = "Añade más agua a la solución de la planta";
    public final static String CAMBIA_SOLUCION = "Se debe renovar la solución";

    public static Finder<Long, ReporteEntity> FINDER = new Finder<>(ReporteEntity.class);

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "Reporte")
    private Long id;

    @ManyToOne
    private PlantaEntity planta;

    private String recomendacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlantaEntity getPlanta() {
        return planta;
    }

    public void setPlantas(PlantaEntity plantas) {
        this.planta = plantas;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }
}
