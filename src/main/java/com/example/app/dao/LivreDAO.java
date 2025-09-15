package com.example.app.dao;

import com.example.app.entity.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

// DAO = couche d'accès à la base de données
public class LivreDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

    public void save(Livre livre) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(livre); // INSERT INTO livres
        em.getTransaction().commit();
        em.close();
    }

    public List<Livre> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Livre> livres = em.createQuery("from Livre", Livre.class).getResultList();
        em.close();
        return livres;
    }
}
