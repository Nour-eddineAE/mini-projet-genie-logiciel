package com.example.mini_projet_g_logiciel.dao;

import com.example.mini_projet_g_logiciel.entities.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssuranceRepository extends JpaRepository<Assurance, String> {
}
