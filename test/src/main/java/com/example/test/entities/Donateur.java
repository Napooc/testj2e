package com.example.test.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.time.LocalDate;

@Entity
public class Donateur {

    @Id
    private Long id;

    private String nom;

    @Column(name = "objectif_montant")
    private double objectifMontant;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    // Constructeur par défaut
    public Donateur() {}

    // Constructeur avec paramètres
    public Donateur(Long id, String nom, double objectifMontant, LocalDate dateDebut, LocalDate dateFin) {
        this.id = id;
        this.nom = nom;
        this.objectifMontant = objectifMontant;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getObjectifMontant() {
        return objectifMontant;
    }

    public void setObjectifMontant(double objectifMontant) {
        this.objectifMontant = objectifMontant;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}
