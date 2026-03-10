package com.SupplyFlow.SupplyFlow.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String categorie;
    private double prix;
    private int quantity;

    public Produit(String nom, String categorie, double prix, int quantity) {
        this.nom = nom;
        this.categorie = categorie;
        this.prix = prix;
        this.quantity = quantity;
    }

    public Produit() {
    }

    @ManyToOne
    @JoinColumn(name = "id_fournisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "produit" , cascade = CascadeType.ALL)
    private List<Mouvement> mouvement;

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public List<Mouvement> getMouvement() {
        return mouvement;
    }

    public void setMouvement(List<Mouvement> mouvement) {
        this.mouvement = mouvement;
    }

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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
