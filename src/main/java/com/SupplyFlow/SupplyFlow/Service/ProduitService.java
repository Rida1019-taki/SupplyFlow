package com.SupplyFlow.SupplyFlow.Service;

import com.SupplyFlow.SupplyFlow.Model.Produit;
import com.SupplyFlow.SupplyFlow.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getProduits(){
        return produitRepository.findAll();
    }

    public Produit getProduitById( Long id){
        return produitRepository.findById(id).orElse(null);
    }

    public Produit addProduit(Produit produit){
        return produitRepository.save(produit);
    }

    public Produit udpateProduit(Long id , Produit produit){
        Produit produitUpdate = produitRepository.findById(id).orElse(null);
        if (produitUpdate != null){
            produitUpdate.setNom(produitUpdate.getNom());
            produitUpdate.setCategorie(produitUpdate.getCategorie());
            produitUpdate.setPrix(produitUpdate.getPrix());
            produitUpdate.setQuantity(produitUpdate.getQuantity());
            return produitRepository.save(produitUpdate);
        }
        return null;
    }

    public void deleteProduit(Long id){
         produitRepository.deleteById(id);
    }
}
