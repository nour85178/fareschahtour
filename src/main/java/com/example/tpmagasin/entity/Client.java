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

public class Client {
    @Id
    @GeneratedValue(strategy = IDENTITY )

    private int idClient;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient ;
    @Enumerated(EnumType.STRING)
    private Profession profession;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<Facture> Factures;



}
