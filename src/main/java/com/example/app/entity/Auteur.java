package com.example.app.entity;

import jakarta.persistence.*;

import java.io.Serializable;

// Entité JPA représentant un utilisateur
@Entity
@Table(name = "auteurs")
public class Auteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long id;

    private String name;

    public Auteur () {}

    public Auteur (String name) {

        this.name = name;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void  setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Auteur [id=" + id + ", name=" + name + "]";
    }

}
