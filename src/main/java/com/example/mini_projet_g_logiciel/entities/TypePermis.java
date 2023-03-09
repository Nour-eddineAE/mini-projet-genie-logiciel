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
public class TypePermis {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codetype;
    private String nom;
    @OneToMany(mappedBy = "typePermis")
    private Collection<Permis> permis;
    @OneToOne(mappedBy = "typePermis")
    private Vehicule vehicule;
}
