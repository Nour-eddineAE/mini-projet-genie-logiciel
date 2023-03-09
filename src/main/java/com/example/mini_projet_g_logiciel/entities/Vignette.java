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
public class Vignette {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeVignette;
    private double montantVignette;
    @ManyToOne
    private Vehicule vehicule;
}
