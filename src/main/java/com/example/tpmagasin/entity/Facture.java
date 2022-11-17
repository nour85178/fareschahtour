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
public class Facture {
    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idFacture;
    private Float montantRemise;
    private Float montantFacture;
    @Temporal (TemporalType.DATE)
    private Date dateFacture;
    private Boolean active;

    @OneToOne(mappedBy = "facture")
    private DetailFacture detailFacture;

    @ManyToOne
    Client client;


}
