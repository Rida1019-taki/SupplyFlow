package com.SupplyFlow.SupplyFlow.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Mouvement")
public class MouvementStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMouvement;
    private int quantity;
    private LocalDate date;
    private String type;

    public MouvementStock(int quantity, LocalDate date, String type) {
        this.quantity = quantity;
        this.date = date;
        this.type = type;
    }

    public MouvementStock() {
    }

    @ManyToOne
    @JoinColumn(name = "id_produit")
    private Produit produit;

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Long getIdMouvement() {
        return idMouvement;
    }

    public void setIdMouvement(Long idMouvement) {
        this.idMouvement = idMouvement;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
