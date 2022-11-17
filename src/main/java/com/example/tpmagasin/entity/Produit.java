package com.example.tpmagasin.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Produit {

    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @OneToOne(mappedBy = "produit")
    private DetailProduit detailProduit;



    @ManyToOne
    Stock stock;

    @ManyToOne
    Rayon rayon;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="produit")
    private Set<DetailFacture> DetailFactures;
}
