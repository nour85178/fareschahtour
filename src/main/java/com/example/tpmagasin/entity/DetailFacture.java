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

public class DetailFacture {
    @Id
    @GeneratedValue(strategy = IDENTITY )
private Long idDetailFacture;
    private int qte;
    private Float prixTotal;
    private int pourcentageRemise;
    private int montantRemise;

    @OneToOne
    private Facture facture;

    @ManyToOne
    Produit produit;
}
