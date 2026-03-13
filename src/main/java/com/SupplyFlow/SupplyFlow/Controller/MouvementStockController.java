package com.SupplyFlow.SupplyFlow.Controller;

import com.SupplyFlow.SupplyFlow.Model.MouvementStock;
import com.SupplyFlow.SupplyFlow.Model.Produit;
import com.SupplyFlow.SupplyFlow.Service.MouvementStockService;
import com.SupplyFlow.SupplyFlow.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/mouvements")
public class MouvementStockController {

    @Autowired
    private MouvementStockService mouvementStockService;

    @Autowired
    private ProduitService produitService;

    @GetMapping
    public String getAllMouvements(Model model) {
        model.addAttribute("mouvements", mouvementStockService.getMouvements());
        model.addAttribute("produits", produitService.getProduits());
        return "mouvements";
    }

    @PostMapping("/entree")
    public String entreeStock(@RequestParam Long produitId, @RequestParam int quantity) {
        mouvementStockService.entreeStock(produitId, quantity);
        return "redirect:/mouvements";
    }

    @PostMapping("/sortie")
    public String sortieStock(@RequestParam Long produitId, @RequestParam int quantity) {
        mouvementStockService.sortieStock(produitId, quantity);
        return "redirect:/mouvements";
    }
}
