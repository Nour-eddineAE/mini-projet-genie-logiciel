package com.example.mini_projet_g_logiciel.service.conducteur;

import com.example.mini_projet_g_logiciel.entities.Conducteur;

import java.util.List;

public interface ConducteurService {
    List<Conducteur> getAvaiblableDrivers();
    List<Conducteur> getAllDrivers();
    Conducteur getDriverById(String driverId);
    Conducteur saveDriver(Conducteur conducteur);
    void removeDriver(String driverId);
}
