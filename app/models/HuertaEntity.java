package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by Sofia on 3/05/17.
 */

@Entity
@Table(name="huertaEntity")
public class HuertaEntity extends Model
{
    public static Finder<Long, HuertaEntity> FINDER = new Finder<>(HuertaEntity.class);

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private UsuarioEntity usuario;
}
