package com.SupplyFlow.SupplyFlow.Controller;

import com.SupplyFlow.SupplyFlow.Model.Fournisseur;
import com.SupplyFlow.SupplyFlow.Model.Produit;
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
    public List<Fournisseur> getFournisseur(){
        return fournisseurService.getFournisseur();
    }

    @PostMapping
    public Fournisseur addFournisseur(@RequestBody Fournisseur fournisseur){
        return fournisseurService.addFournisseur(fournisseur);
    }

    @DeleteMapping("/{id}")
    public void deleteFournisseur(@PathVariable Long id){
         fournisseurService.deleteFournisseur(id);
    }
}
