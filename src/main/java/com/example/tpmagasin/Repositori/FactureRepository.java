package com.example.tpmagasin.Repositori;

import com.example.tpmagasin.entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
