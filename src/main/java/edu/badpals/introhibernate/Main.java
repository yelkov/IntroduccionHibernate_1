package edu.badpals.introhibernate;

import edu.badpals.introhibernate.entity.Empregado;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        HibernateUtil hu = new HibernateUtil();
        hu.conectar();
        hu.crearDepartamento("Ventas");

        Empregado empregado = new Empregado("123456789","Miguel","Pérez",null,1500.0f, LocalDate.of(1990,12,10),'M');
        hu.crearEmpregado(empregado);

        Optional<Empregado> empregado2 = hu.getEmpregado("123456789");
        if(empregado2.isPresent()){
            System.out.println(empregado2.get());
        }else{
            System.out.println("Empregado con nss: 123456789 no encontrado.");
        }

        hu.desconectar();

    }
}
