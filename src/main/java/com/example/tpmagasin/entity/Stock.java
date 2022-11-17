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

public class Stock {
    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idStock;
    private int qteStock;
    private int qteMin;
    private String libelleStock;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
    private Set<Produit> Produits;
}
