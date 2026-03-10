package com.SupplyFlow.SupplyFlow.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Mouvement")
public class Mouvement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMouvement;
    private int quantity;
    private LocalDate date;
    private String type;

    public Mouvement(int quantity, LocalDate date, String type) {
        this.quantity = quantity;
        this.date = date;
        this.type = type;
    }

    public Mouvement() {
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
