package com.SupplyFlow.SupplyFlow.Controller;

import com.SupplyFlow.SupplyFlow.Model.Fournisseur;
import com.SupplyFlow.SupplyFlow.Model.MouvementStock;
import com.SupplyFlow.SupplyFlow.Service.MouvementStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/mouvementStock")
public class MouvementStockController {

    @Autowired
    private MouvementStockService mouvementStockService;

    @GetMapping
    public List<MouvementStock> getAllMouvements() {
        return mouvementStockService.getMouvements();
    }

    @PostMapping("/entree/{produitId}")
    public MouvementStock entreeStock(@PathVariable Long produitId , @RequestBody MouvementStock m){
        return mouvementStockService.entreeStock(produitId , m.getQuantity());
    }

    @PostMapping("/sortie/{produits}")
    public MouvementStock sortieStock(@PathVariable Long produitId , @RequestBody MouvementStock m){
        return mouvementStockService.sortieStock(produitId , m.getQuantity());
    }
}
