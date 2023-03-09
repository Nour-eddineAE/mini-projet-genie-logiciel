package com.example.mini_projet_g_logiciel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Conducteur {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String matricule;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String cin;
    @OneToMany(mappedBy = "conducteur")
    private Collection<Voyage> voyages;
    @OneToMany(mappedBy = "conducteur")
    private Collection<Permis> permis;
    @OneToMany(mappedBy = "conducteur")
    private Collection<Conge> conges;
}
