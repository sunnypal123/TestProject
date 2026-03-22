package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Car;
import entity.Engine;

public class Save {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Engine en = new Engine();
        en.setEid(333);
        en.setCc(1300);

        Car car = new Car();
        car.setCid(103);
        car.setBrand("AUDI");
        car.setPrice(600000L);
        car.setEngine(en); // ✅ fixed method name

        et.begin();
        em.persist(en);  // ✅ persist engine first
        em.persist(car);
        et.commit();

        System.out.println("saved");

        em.close();   // ✅ close resources
        emf.close();
    }
}
