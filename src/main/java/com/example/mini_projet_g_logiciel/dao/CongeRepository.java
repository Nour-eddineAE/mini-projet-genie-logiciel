package com.example.mini_projet_g_logiciel.dao;

import com.example.mini_projet_g_logiciel.entities.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CongeRepository extends JpaRepository<Conge, String> {
    @Query("select Conge from Conge conge where conge.conducteur.matricule = :x")
    List<Conge> getCongesByConducteur(@Param("x") String driverId);
}
