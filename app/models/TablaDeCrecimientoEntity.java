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

    private PlantaEntity planta;

    private String tipoPlanta;

    private double rangoSuperiorPH;
    private double rangoInferiorPH;
    private double phInicial;
    private double phActual;

    //Electro-Conductivity Factor can be expressed as either milliSiemens (mS), cF, or parts per million (PPM)
    //1 mS = 10cF = 700ppm
    private double rangoSuperiorEC;
    private double rangoInferiorEC;
    private double ecInicial;
    private double ecActual;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlantaEntity getPlanta() {
        return planta;
    }

    public void setPlanta(PlantaEntity planta) {
        this.planta = planta;
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

    public double getPhInicial() {
        return phInicial;
    }

    public void setPhInicial(double phInicial) {
        this.phInicial = phInicial;
    }

    public double getPhActual() {
        return phActual;
    }

    public void setPhActual(double phActual) {
        this.phActual = phActual;
    }

    public double getEcInicial() {
        return ecInicial;
    }

    public void setEcInicial(double ecInicial) {
        this.ecInicial = ecInicial;
    }

    public double getEcActual() {
        return ecActual;
    }

    public void setEcActual(double ecActual) {
        this.ecActual = ecActual;
    }
}
