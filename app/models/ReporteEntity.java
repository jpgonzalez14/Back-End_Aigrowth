package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by Sofia on 3/05/17.
 */

@Entity
@Table(name="reporteEntity")
public class ReporteEntity extends Model
{
    public static Finder<Long, ReporteEntity> FINDER = new Finder<>(ReporteEntity.class);

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "Reporte")
    private Long id;

    @ManyToOne()
    private PlantaEntity planta;

}
