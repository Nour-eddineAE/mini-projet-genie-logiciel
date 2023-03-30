package com.example.mini_projet_g_logiciel.dao;

import com.example.mini_projet_g_logiciel.entities.Vehicule;
import com.example.mini_projet_g_logiciel.entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface VehiculeRepository extends JpaRepository<Vehicule, String> {
    /**
     * if any trip in the specified interval, then unavailable
     */
    @Query("select Voyage from Vehicule.voyages voyages" +
            " where voyages.dateDebutVoyage <= :dateDebut " +
            "  and voyages.dateFinVoyage >= :dateFin")
    List<Voyage> getVoyagesByInterval(@Param("dateDebut") Date dateDebut,@Param("dateFin") Date dateFin);
}
