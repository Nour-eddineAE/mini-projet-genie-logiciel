package com.example.mini_projet_g_logiciel.service.disponibilité;

import com.example.mini_projet_g_logiciel.dao.ConductorRepository;
import com.example.mini_projet_g_logiciel.dao.VehiculeRepository;
import com.example.mini_projet_g_logiciel.entities.Conducteur;
import com.example.mini_projet_g_logiciel.entities.Permis;
import com.example.mini_projet_g_logiciel.entities.Vehicule;
import com.example.mini_projet_g_logiciel.entities.Voyage;
import com.example.mini_projet_g_logiciel.service.conducteur.ConducteurService;
import com.example.mini_projet_g_logiciel.service.vehicule.VehiculeService;

import java.util.Date;
import java.util.List;

public class AvailabilityServiceImpl implements AvailabilityService{
    private final VehiculeRepository  vehiculeRepository;
    private final ConductorRepository conductorRepository;
    private final ConducteurService conducteurService;
    private final VehiculeService vehiculeService;

    //Injection by constructor
    public AvailabilityServiceImpl(VehiculeRepository vehiculeRepository,
                                   ConductorRepository conductorRepository,
                                   ConducteurService conducteurService,
                                   VehiculeService vehiculeService) {
        this.vehiculeRepository = vehiculeRepository;
        this.conductorRepository = conductorRepository;
        this.conducteurService = conducteurService;
        this.vehiculeService = vehiculeService;
    }

    @Override
    public boolean isVehicleAvailable(String vehicleId, Date dateDebut, Date dateFin) {
        // if empty list => no trip in the specified interval => available
        List<Voyage> voyages = vehiculeRepository.getVoyagesByInterval(dateDebut, dateFin);
        return voyages.isEmpty();
    }

    @Override
    public boolean isDriverAvailable(String driverId, String vehicleId, Date dateDebut, Date dateFin) {
        // get driver trips in an interval
        List<Voyage> driverTrips = conductorRepository.getTripsByInterval(dateDebut, dateFin);
            if (driverTrips.isEmpty()) {
                Conducteur conducteur = conducteurService.getDriverById(driverId);
                List<Permis> permis = (List<Permis>) conducteur.getPermis();
                if (permis.isEmpty()) return false;

                Vehicule vehicule = vehiculeService.getVehicleById(vehicleId);
                for (Permis p : permis) {
                    if (p.getTypePermis() == vehicule.getTypePermis()) return true;
                }
            }
        return false;
    }
}
