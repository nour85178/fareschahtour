package com.example.tpmagasin.Repositori;

import com.example.tpmagasin.entity.DetailProduit;
import com.example.tpmagasin.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
