package com.SupplyFlow.SupplyFlow.Service;

import com.SupplyFlow.SupplyFlow.Model.Fournisseur;
import com.SupplyFlow.SupplyFlow.Repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;

    public List<Fournisseur> getFournisseur(){
        return fournisseurRepository.findAll();
    }

    public Fournisseur addFournisseur(Fournisseur fournisseur){
        return fournisseurRepository.save(fournisseur);
    }

    public void deleteFournisseur(Long id){
         fournisseurRepository.deleteById(id);
    }
}
