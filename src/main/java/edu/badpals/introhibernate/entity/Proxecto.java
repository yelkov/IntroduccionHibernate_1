package edu.badpals.introhibernate.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "proxectos", schema = "empresahb")
public class Proxecto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTOINCREMENT")
    @SequenceGenerator(name = "AUTOINCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "NUMPROXECTO", nullable = false)
    private Integer id;

    @Size(max = 25)
    @NotNull
    @Column(name = "NOMEPROXECTO", nullable = false, length = 25)
    private String nomeproxecto;

    @Size(max = 25)
    @NotNull
    @Column(name = "LUGAR", nullable = false, length = 25)
    private String lugar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeproxecto() {
        return nomeproxecto;
    }

    public void setNomeproxecto(String nomeproxecto) {
        this.nomeproxecto = nomeproxecto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

}