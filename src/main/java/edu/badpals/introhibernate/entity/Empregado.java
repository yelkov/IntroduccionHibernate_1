package edu.badpals.introhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "empregados", schema = "empresahb")
public class Empregado {
    @Id
    @Size(max = 15)
    @Column(name = "NSS", nullable = false, length = 15)
    private String nss;

    @Size(max = 25)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 25)
    private String nombre;

    @Size(max = 25)
    @NotNull
    @Column(name = "APELIDO1", nullable = false, length = 25)
    private String apelido1;

    @Size(max = 25)
    @Column(name = "APELIDO2", length = 25)
    private String apelido2;

    @NotNull
    @Column(name = "SALARIO", nullable = false)
    private Float salario;

    @Column(name = "DATANACEMENTO")
    private LocalDate datanacemento;

    @NotNull
    @Column(name = "SEXO", nullable = false)
    private Character sexo;

    public Empregado() {}

    public Empregado(String nss, String nombre, String apelido1, String apelido2, Float salario, LocalDate datanacemento, Character sexo) {
        this.nss = nss;
        this.nombre = nombre;
        this.apelido1 = apelido1;
        this.apelido2 = apelido2;
        this.salario = salario;
        this.datanacemento = datanacemento;
        this.sexo = sexo;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido1() {
        return apelido1;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public String getApelido2() {
        return apelido2;
    }

    public void setApelido2(String apelido2) {
        this.apelido2 = apelido2;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public LocalDate getDatanacemento() {
        return datanacemento;
    }

    public void setDatanacemento(LocalDate datanacemento) {
        this.datanacemento = datanacemento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nss='" + nss + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apelido1='" + apelido1 + '\'' +
                ", apelido2='" + apelido2 + '\'' +
                ", salario=" + salario +
                ", datanacemento=" + datanacemento +
                ", sexo=" + sexo +
                '}';
    }
}