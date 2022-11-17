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

public class DetailProduit {

    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idDetailProduit;
    @Temporal (TemporalType.DATE)
    private Date dateCreation;
    @Temporal (TemporalType.DATE)
    private Date dateDerniereModification;
    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit;

    @OneToOne
    private Produit produit;

}
