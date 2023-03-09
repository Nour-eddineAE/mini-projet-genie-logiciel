package com.example.mini_projet_g_logiciel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String immatriculationm;
    private double kilometrage;
    private int puissance;
    @OneToMany(mappedBy = "vehicule")
    private Collection<Assurance> assurances;
    @OneToMany(mappedBy = "vehicule")
    private Collection<Vignette> vignettes;
    @OneToMany(mappedBy = "vehicule")
    private Collection<VisiteTechnique> visiteTechniques;
    @OneToMany(mappedBy = "vehicule")
    private Collection<Voyage> voyages;
    @OneToOne
    private TypePermis typePermis;
    @ManyToOne
    private Carburant carburant;
}
