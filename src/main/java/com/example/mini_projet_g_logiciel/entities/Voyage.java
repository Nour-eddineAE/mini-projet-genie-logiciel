package com.example.mini_projet_g_logiciel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeVoyage;
    private Date dateFinVoyage;
    private Date dateDebutVoyage;
    @ManyToOne
    private Vehicule vehicule;
    @ManyToOne
    private Conducteur conducteur;
}
