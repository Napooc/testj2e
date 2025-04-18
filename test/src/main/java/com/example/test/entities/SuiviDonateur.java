package com.example.test.entities;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class SuiviDonateur {

    @Id
    private Long id;

    // Relation ManyToOne avec l'entité Donateur
    @ManyToOne
    @JoinColumn(name = "donateur_id", nullable = false)  // Nom de la colonne de clé étrangère
    private Donateur donateur;

    private String nomDonateur;
    private double montant;
    private LocalDate date;

    // Constructeur par défaut
    public SuiviDonateur() {}

    // Constructeur avec paramètres
    public SuiviDonateur(Long id, Donateur donateur, String nomDonateur, double montant, LocalDate date) {
        this.id = id;
        this.donateur = donateur;
        this.nomDonateur = nomDonateur;
        this.montant = montant;
        this.date = date;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Donateur getDonateur() {
        return donateur;
    }

    public void setDonateur(Donateur donateur) {
        this.donateur = donateur;
    }

    public String getNomDonateur() {
        return nomDonateur;
    }

    public void setNomDonateur(String nomDonateur) {
        this.nomDonateur = nomDonateur;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
