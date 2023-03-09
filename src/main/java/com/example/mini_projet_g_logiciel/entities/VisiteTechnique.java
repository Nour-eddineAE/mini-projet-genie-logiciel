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
public class VisiteTechnique {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeVisite;
    private Date dateVisite;
    @ManyToOne
    private Vehicule vehicule;
}
