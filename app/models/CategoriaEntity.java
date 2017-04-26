package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by jp.gonzalez14 on 26/04/17.
 */
@Entity
@Table(name="categoriaEntity")
public class CategoriaEntity extends Model{

    public static Finder<Long, CategoriaEntity> FINDER = new Finder<>(CategoriaEntity.class);

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "Categoria")
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "categoria",cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlantaEntity> plantas;

    public CategoriaEntity()
    {
        this.id=null;
        this.nombre="NO NAME";
        this.plantas=new ArrayList<PlantaEntity>();
    }

    public CategoriaEntity(Long id) {
        this();
        this.id = id;
    }

    public CategoriaEntity(Long pId, String pNombre)
    {
        this.id=pId;
        this.nombre=pNombre;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PlantaEntity> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<PlantaEntity> plantas) {
        this.plantas = plantas;
    }

    public void addPlanta(PlantaEntity nuevo){ plantas.add(nuevo);}

}
