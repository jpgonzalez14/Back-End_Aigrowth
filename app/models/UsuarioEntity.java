package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by aj.paredes10 on 27/04/17.
 */

@Entity
@Table(name="usuarioEntity")
public class UsuarioEntity extends Model
{
    public static Finder<Long, UsuarioEntity> FINDER = new Finder<>(UsuarioEntity.class);

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "Usuario")
    private Long id;
    private String nombre;
    private String clave;
    private String correo;

    public UsuarioEntity()
    {
        id=null;
        nombre="NO NAME";
        clave="NO NAME";
        correo="NO NAME";
    }
    public UsuarioEntity(Long id)
    {
        this();
        setId(id);
    }
    public UsuarioEntity(Long id, String nombre, String clave, String correo)
    {
        this();
        setId(id);
        setNombre(nombre);
        setClave(clave);
        setCorreo(correo);
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getClave()
    {
        return clave;
    }

    public void setClave(String clave)
    {
        this.clave = clave;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

}
