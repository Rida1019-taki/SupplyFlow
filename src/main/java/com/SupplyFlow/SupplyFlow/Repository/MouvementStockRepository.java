package com.SupplyFlow.SupplyFlow.Repository;

import com.SupplyFlow.SupplyFlow.Model.MouvementStock;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MouvementStockRepository extends JpaRepository<MouvementStock, Long> {

    List<MouvementStock> findByProduitId(Long produitId);

}
