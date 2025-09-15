package com.example.app.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

// Entité JPA représentant un livre
@Entity
@Table(name = "livres")
public class Livre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long id;

    private String titre;
    private String isbn;
    private Date datePublication;

    @ManyToOne
    private Auteur auteur;

    public Livre () {}

    public Livre (String titre) {
        this.titre = titre;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }
    public String getTitre () {
        return titre;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setTitre (String titre) {
        this.titre = titre;
    }

    public String toString() {
        return "Livre [id=" + id + ", titre=" + titre + "]";
    }
}