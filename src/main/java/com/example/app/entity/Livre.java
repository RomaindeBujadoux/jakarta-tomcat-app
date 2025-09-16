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

    public void setId(Long id){
        this.id = id;
    }

    public String getTitre () {
        return titre;
    }

    public void setTitre (String titre) {
        this.titre = titre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public String toString() {
        return "Livre [id=" + id + ", titre=" + titre + "]";
    }
}