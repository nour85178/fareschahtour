package com.example.tpmagasin.Repositori;

import com.example.tpmagasin.entity.DetailProduit;
import com.example.tpmagasin.entity.Rayon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RayonRepository extends JpaRepository<Rayon,Long> {
}
