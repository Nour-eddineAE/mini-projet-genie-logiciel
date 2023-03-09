package com.example.mini_projet_g_logiciel.dao;

import com.example.mini_projet_g_logiciel.entities.Vignette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VignetteRepository extends JpaRepository<Vignette, String> {
}
