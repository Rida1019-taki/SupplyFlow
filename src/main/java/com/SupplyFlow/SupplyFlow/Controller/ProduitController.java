package com.SupplyFlow.SupplyFlow.Controller;

import com.SupplyFlow.SupplyFlow.Model.Produit;
import com.SupplyFlow.SupplyFlow.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> getProduit(){
        return produitService.getProduits();
    }

    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable Long id){
        return produitService.getProduitById(id);
    }

    @PostMapping
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.addProduit(produit);
    }

    @PutMapping("/{id}")
    public Produit updateProduit(@PathVariable Long id , @RequestBody Produit produit){
        return produitService.udpateProduit(id , produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id){
         produitService.deleteProduit(id);
    }
}
