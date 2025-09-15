package com.example.app.dao;

import com.example.app.entity.Auteur;
import com.example.app.entity.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

// DAO = couche d'accès à la base de données
public class AuteurDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

    public void save(Auteur auteur) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(auteur); // INSERT INTO users
        em.getTransaction().commit();
        em.close();
    }

    public List<Auteur> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Auteur> auteurs = em.createQuery("from Auteur", Auteur.class).getResultList();
        em.close();
        return auteurs;
    }
}
