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
public class Carburant {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeCarburant;
    private String nom;
    private double prix;
    @OneToMany(mappedBy = "carburant")
    private Collection<Vehicule> vehicules;
}
