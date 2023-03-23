package com.example.mini_projet_g_logiciel.service.vehicule;

import com.example.mini_projet_g_logiciel.entities.Vehicule;

import java.util.Date;
import java.util.List;

public interface VehiculeService {
    List<Vehicule> getAllVehicles();

    List<Vehicule> getAvailableVehicles();

    Vehicule getVehicleById(String vehicleId);

    Vehicule saveVehicle(Vehicule vehicule);

    void removeVehicle(String vehicleId);

    boolean isAvailable(String vehicleId, Date dateDebut, Date dateFin);
}
