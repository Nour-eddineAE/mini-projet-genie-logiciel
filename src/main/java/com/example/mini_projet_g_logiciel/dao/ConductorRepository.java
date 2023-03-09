package com.example.mini_projet_g_logiciel.dao;

import com.example.mini_projet_g_logiciel.entities.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Entity, Id type>
public interface ConductorRepository extends JpaRepository<Conducteur, String> {
}
