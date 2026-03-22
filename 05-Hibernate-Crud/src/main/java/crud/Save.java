package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Sunny;

public class Save {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();          // ✅ correct type
        EntityTransaction et = em.getTransaction();

        Sunny sunny = new Sunny();
        sunny.setId(103);
        sunny.setName("vishnu");
        sunny.setDesign("jewwllers");
        sunny.setSalary(670000);

        et.begin();
        em.persist(sunny);
        et.commit();

        // ✅ Good practice: always close resources
        em.close();
        emf.close();
    }
}