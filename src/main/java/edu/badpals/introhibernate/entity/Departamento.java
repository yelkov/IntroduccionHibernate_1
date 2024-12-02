package edu.badpals.introhibernate.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "departamentos", schema = "empresahb")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTOINCREMENT")
    @SequenceGenerator(name = "AUTOINCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "NUMDEPARTAMENTO", nullable = false)
    private Integer id;

    @Size(max = 25)
    @NotNull
    @Column(name = "NOMEDEPARTAMENTO", nullable = false, length = 25)
    private String nomedepartamento;

    public Departamento() {
    }

    public Departamento(String nomedepartamento) {
        this.nomedepartamento = nomedepartamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomedepartamento() {
        return nomedepartamento;
    }

    public void setNomedepartamento(String nomedepartamento) {
        this.nomedepartamento = nomedepartamento;
    }

}