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

    private String name;
    private String isbn;
    private Date datePublication;

    @ManyToOne
    private Auteur auteur;

    public Livre () {}

    public Livre (String name) {
        this.name = name;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }
    public String getName () {
        return name;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }

    public String toString() {
        return "Livre [id=" + id + ", name=" + name + "]";
    }
}