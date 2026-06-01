package com.SupplyFlow.SupplyFlow.Service;

import com.SupplyFlow.SupplyFlow.Model.MouvementStock;
import com.SupplyFlow.SupplyFlow.Model.Produit;
import com.SupplyFlow.SupplyFlow.Repository.MouvementStockRepository;
import com.SupplyFlow.SupplyFlow.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MouvementStockService {

//    @Autowired
    private final MouvementStockRepository mouvementStockRepository;
    public MouvementStockService(MouvementStockRepository mouvementStockRepository){
        this.mouvementStockRepository = mouvementStockRepository;
    }


    @Autowired
    private ProduitRepository produitRepository;

    public List<MouvementStock> getMouvements(){
        return mouvementStockRepository.findAll();
    }

    public MouvementStock entreeStock(Long produitId , int quantity){
        Produit produit = produitRepository.findById(produitId).orElse(null);
        if (produit != null){
            produit.setQuantity(produit.getQuantity() + quantity);
            produitRepository.save(produit);

            MouvementStock mouvementStock = new MouvementStock();
            mouvementStock.setType("ENTREE");
            mouvementStock.setQuantity(quantity);
            mouvementStock.setDate(LocalDate.now());
            mouvementStock.setProduit(produit);
            return mouvementStockRepository.save(mouvementStock);
        }
        return null;
    }

    public MouvementStock sortieStock(Long produitId , int quantity){
        Produit produit = produitRepository.findById(produitId).orElse(null);
        if (produit != null){
            if (produit.getQuantity() >= quantity) {
                produit.setQuantity(produit.getQuantity() - quantity);
                produitRepository.save(produit);

                MouvementStock mouvementStock = new MouvementStock();
                mouvementStock.setType("SORTIE");
                mouvementStock.setQuantity(quantity);
                mouvementStock.setDate(LocalDate.now());
                mouvementStock.setProduit(produit);
                return mouvementStockRepository.save(mouvementStock);
            }else {
                throw new RuntimeException("Stock insuffisant");
            }
        }
        return null;
    }
}
