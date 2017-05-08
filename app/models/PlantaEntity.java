package models;

import com.avaje.ebean.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jp.gonzalez14 on 24/04/17.
 */

@Entity
@Table(name="plantaEntity")
public class PlantaEntity extends Model{

    public static Finder<Long, PlantaEntity> FINDER = new Finder<>(PlantaEntity.class);

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "Planta")
    private Long id;
    private String nombre;
    private String nombreCientifico;
    private String descripcion;

    @ManyToOne
    @JsonBackReference
    private CategoriaEntity categoria;

    @OneToOne(cascade = CascadeType.ALL)
    private TablaDeCrecimientoEntity tabla;

    @OneToOne(cascade = CascadeType.ALL)
    private SensorEntity sensor;

    @OneToMany(mappedBy = "planta")
    private List<ReporteEntity> reportes = new ArrayList<ReporteEntity>();

    public PlantaEntity()
    {
        this.id=null;
        this.nombre="NO NAME";
        this.nombreCientifico ="NO NAME";
        this.descripcion = "NO NAME";

    }

    public void addToReportes(ReporteEntity r)
    {
        reportes.add(r);
    }

    public SensorEntity getSensor() {
        return sensor;
    }

    public void setSensor(SensorEntity sensor) {
        this.sensor = sensor;
    }

    public PlantaEntity(Long id) {
        this();
        this.id = id;
    }
    public PlantaEntity(Long pId, String pNombre, String pNombreCientifico, String pDescripcion, CategoriaEntity pCategoria)
    {
        this.id=pId;
        this.nombre=pNombre;
        this.nombreCientifico=pNombreCientifico;
        this.descripcion=pDescripcion;
        this.categoria=pCategoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public TablaDeCrecimientoEntity getTabla() {
        return tabla;
    }

    public void setTabla(TablaDeCrecimientoEntity tabla) {
        this.tabla = tabla;
    }
}
