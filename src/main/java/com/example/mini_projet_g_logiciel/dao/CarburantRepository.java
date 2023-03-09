package com.example.mini_projet_g_logiciel.dao;

import com.example.mini_projet_g_logiciel.entities.Carburant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarburantRepository extends JpaRepository<Carburant, String> {
}
