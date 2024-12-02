package edu.badpals.introhibernate;

import edu.badpals.introhibernate.entity.Departamento;
import edu.badpals.introhibernate.entity.Empregado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import java.security.spec.ECField;
import java.util.Optional;

public class HibernateUtil {
    private EntityManagerFactory emf;
    private EntityManager em;

    public HibernateUtil() {}

    public void conectar() {
        try{
            emf = Persistence.createEntityManagerFactory("default");
            em = emf.createEntityManager();
            System.out.println("Conexión exitosa");
        }catch(Exception e){
            System.out.println("Error al crear EntityManager");
        }
    }

    public void desconectar() {
        em.close();
        emf.close();
    }

    public void crearDepartamento(String nombreDepartamento){
        Departamento departamento = new Departamento(nombreDepartamento);
        try{
            em.getTransaction().begin();
            em.persist(departamento);
            em.getTransaction().commit();
            System.out.println("\nSe ha creado el departamento de nombre: "+ nombreDepartamento);
        }catch(PersistenceException e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            System.out.println("Error al crear departamento. Ya existe el nombre "+nombreDepartamento+ " para un departamento.");
        }
    }

    public void crearEmpregado(Empregado empregado){
        try{
            em.getTransaction().begin();
            em.persist(empregado);
            em.getTransaction().commit();
            System.out.println("\nEmpregado creado exitosamente.");
        }catch (Exception e){
            em.getTransaction().rollback();
            System.out.println("Error al crear empregado");
        }
    }

    public Optional<Empregado> getEmpregado(String nss){
        Empregado empregado = em.find(Empregado.class, nss);
        return Optional.ofNullable(empregado);
    }

    public void deleteDepartamento(int numDepartamento){
        try{
            em.getTransaction().begin();
            em.remove(em.find(Departamento.class, numDepartamento));
            em.getTransaction().commit();
            System.out.println("\nDepartamento eliminado exitosamente.");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("No se pudo borrar al departamento de id: "+numDepartamento);
        }
    }

    public void cambiarNombreDepartamento(int numDepartamento, String nombreDepartamento){
        try{
            Departamento departamento = em.find(Departamento.class, numDepartamento);
            if (departamento != null){
                em.getTransaction().begin();
                departamento.setNomedepartamento(nombreDepartamento);
                em.getTransaction().commit();
                System.out.println("Nombre de departamento modificado exitosamente.");
            }else{
                System.out.println("No se encuentra el departamento con id "+ numDepartamento);
            }
        }catch (Exception e){
            em.getTransaction().rollback();
            System.out.println("Error al cambiar el nombre de departamento");
        }
    }

}
