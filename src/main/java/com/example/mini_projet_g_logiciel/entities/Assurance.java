package com.example.mini_projet_g_logiciel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeAssurance;
    private int dureeAssurance;
    @ManyToOne
    private Vehicule vehicule;
}
