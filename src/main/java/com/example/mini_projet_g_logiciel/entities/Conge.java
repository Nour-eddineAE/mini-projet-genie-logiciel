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
public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeConge;
    private Date dateDebut;
    private int dureeConge;
    @ManyToOne
    private Conducteur conducteur;
}
