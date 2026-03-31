package crud;

import javax.persistence.*;
import entity.*;

public class Save {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            Product p = new Product();
            p.setName("jeans");
            p.setBrand("zara");       // ← fixed typo

            Review r = new Review();
            r.setMsg("good");
            r.setProduct(p);          // ← link review to product

            Review r2 = new Review();
            r2.setMsg("bad");
            r2.setProduct(p);         // ← link review to product

            et.begin();
            em.persist(p);            // ← persist product first
            em.persist(r);
            em.persist(r2);
            et.commit();

            System.out.println("Saved successfully!");

        } catch (Exception e) {
            if (et.isActive()) et.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}