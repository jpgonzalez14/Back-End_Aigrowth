package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by Sofia on 7/05/17.
 */
@Entity
@Table(name="sensorEntity")
public class SensorEntity extends Model
{
    public static Finder<Long, SensorEntity> FINDER = new Finder<>(SensorEntity.class);

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "Sensor")
    private Long id;

    private double ph;
    private double ec;

    private PlantaEntity planta;

    private String recomendacion;

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public double getEc() {
        return ec;
    }

    public void setEc(double ec) {
        this.ec = ec;
    }

    public PlantaEntity getPlanta() {
        return planta;
    }

    public void setPlanta(PlantaEntity planta) {
        this.planta = planta;
    }
}
