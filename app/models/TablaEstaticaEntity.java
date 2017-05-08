package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

/**
 * Created by Sofia on 4/05/17.
 */
@Entity
@Table(name="tablaEstaticaEntity")
public class TablaEstaticaEntity extends Model
{
    public static Finder<Long, TablaEstaticaEntity> FINDER = new Finder<>(TablaEstaticaEntity.class);

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String tipoPlanta;

    private double rangoSuperiorPH;
    private double rangoInferiorPH;

    //Electro-Conductivity Factor can be expressed as either milliSiemens (mS), cF, or parts per million (PPM)
    //1 mS = 10cF = 700ppm
    private double rangoSuperiorEC;
    private double rangoInferiorEC;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public double getRangoSuperiorPH() {
        return rangoSuperiorPH;
    }

    public void setRangoSuperiorPH(double rangoSuperiorPH) {
        this.rangoSuperiorPH = rangoSuperiorPH;
    }

    public double getRangoInferiorPH() {
        return rangoInferiorPH;
    }

    public void setRangoInferiorPH(double rangoInferiorPH) {
        this.rangoInferiorPH = rangoInferiorPH;
    }

    public double getRangoSuperiorEC() {
        return rangoSuperiorEC;
    }

    public void setRangoSuperiorEC(double rangoSuperiorEC) {
        this.rangoSuperiorEC = rangoSuperiorEC;
    }

    public double getRangoInferiorEC() {
        return rangoInferiorEC;
    }

    public void setRangoInferiorEC(double rangoInferiorEC) {
        this.rangoInferiorEC = rangoInferiorEC;
    }
}
