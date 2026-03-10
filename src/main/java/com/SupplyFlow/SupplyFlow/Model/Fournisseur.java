package com.SupplyFlow.SupplyFlow.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Fournisseur")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private String nom;
    private String ville;

    public Fournisseur(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
    }

    public Fournisseur() {
    }

    public Long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdidFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
