package com.SupplyFlow.SupplyFlow.Controller;

import com.SupplyFlow.SupplyFlow.Model.Produit;
import com.SupplyFlow.SupplyFlow.Service.FournisseurService;
import com.SupplyFlow.SupplyFlow.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping
    public String getProduits(Model model) {
        model.addAttribute("produits", produitService.getProduits());
        return "produits";
    }

    @GetMapping("/ajouter")
    public String showAddProduitForm(Model model) {
        model.addAttribute("produit", new Produit());
        model.addAttribute("fournisseurs", fournisseurService.getFournisseur());
        return "ajouter-produit";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Produit getProduitById(@PathVariable Long id){
        return produitService.getProduitById(id);
    }

    @PostMapping("/ajouter")
    public String addProduit(@ModelAttribute("produit") Produit produit) {
        produitService.addProduit(produit);
        return "redirect:/produits";
    }

    @GetMapping("/modifier/{id}")
    public String showEditProduitForm(@PathVariable Long id, Model model) {
        Produit produit = produitService.getProduitById(id);
        model.addAttribute("produit", produit);
        model.addAttribute("fournisseurs", fournisseurService.getFournisseur());
        return "modifier-produit";
    }

    @PostMapping("/modifier/{id}")
    public String updateProduit(@PathVariable Long id, @ModelAttribute Produit produit) {
        produitService.updateProduit(id, produit);
        return "redirect:/produits";
    }

    @GetMapping("/supprimer/{id}")
    public String deleteProduit(@PathVariable Long id) {
        produitService.deleteProduit(id);
        return "redirect:/produits";
    }
}
