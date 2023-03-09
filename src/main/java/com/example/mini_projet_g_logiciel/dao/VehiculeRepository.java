package com.example.mini_projet_g_logiciel.dao;

import com.example.mini_projet_g_logiciel.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule, String> {
}
