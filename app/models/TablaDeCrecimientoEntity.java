package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by Sofia on 1/05/17.
 */

@Entity
@Table(name = "tablaDeCrecimientoEntity")
public class TablaDeCrecimientoEntity extends Model
{
    public static Finder<Long, TablaDeCrecimientoEntity> FINDER = new Finder<>(TablaDeCrecimientoEntity.class);

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private PlantaEntity planta;
}
