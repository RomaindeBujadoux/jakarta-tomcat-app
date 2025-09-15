package com.example.app.entity;

import jakarta.persistence.*;

import java.io.Serializable;

// Entité JPA représentant un utilisateur
@Entity
@Table(name = "livres")
public class Livre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long id;

    private String name;

    public Livre () {}

    public Livre (String name) {
        this.name = name;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Livre [id=" + id + ", name=" + name + "]";
    }
}
