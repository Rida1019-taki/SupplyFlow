package com.SupplyFlow.SupplyFlow.Controller;


import com.SupplyFlow.SupplyFlow.Model.Fournisseur;
import org.springframework.ui.Model;
import com.SupplyFlow.SupplyFlow.Service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/fournisseur")
public class FournisseurController {

    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping
    public String listFournisseurs(Model model){
        List<Fournisseur> fournisseurs = fournisseurService.getFournisseur();
        model.addAttribute("fournisseurs", fournisseurs);
        return "fournisseurs";
    }

    @GetMapping("/ajouter")
    public String showAddFournisseurForm(Model model) {
        model.addAttribute("fournisseur", new Fournisseur());
        return "ajouter-fournisseur";
    }

    @PostMapping("/ajouter")
    public String addFournisseur(@ModelAttribute("fournisseur") Fournisseur fournisseur){
        fournisseurService.addFournisseur(fournisseur);
        return "redirect:/fournisseur";
    }

    @DeleteMapping("/{id}")
    public void deleteFournisseur(@PathVariable Long id){
         fournisseurService.deleteFournisseur(id);
    }
}
