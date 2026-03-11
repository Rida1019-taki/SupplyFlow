package com.SupplyFlow.SupplyFlow.Model;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(mappedBy = "produit")
    private List<Produit> produit;

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public Long getIdFournisseur() {
        return idFournisseur;
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
