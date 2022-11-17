package com.example.tpmagasin.Repositori;

import com.example.tpmagasin.entity.DetailProduit;
import com.example.tpmagasin.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
