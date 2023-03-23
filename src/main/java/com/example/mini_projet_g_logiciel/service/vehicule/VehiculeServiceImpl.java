package com.example.mini_projet_g_logiciel.service.vehicule;

import com.example.mini_projet_g_logiciel.dao.VehiculeRepository;
import com.example.mini_projet_g_logiciel.entities.Vehicule;
import com.example.mini_projet_g_logiciel.entities.Voyage;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService {
    private final VehiculeRepository vehiculeRepository;


    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public List<Vehicule> getAllVehicles() {
        return vehiculeRepository.findAll();
    }

    @Override
    public List<Vehicule> getAvailableVehicles() {
        //TODO
        return null;
    }

    @Override
    public Vehicule getVehicleById(String vehicleId) {
        Vehicule vehicule = vehiculeRepository.findById(vehicleId).orElse(null);
        if (vehicule == null) throw new RuntimeException("No vehicle with the given ID");
        return vehicule;
    }

    @Override
    public Vehicule saveVehicle(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void removeVehicle(String vehicleId) {
        vehiculeRepository.deleteById(vehicleId);
    }

    @Override
    public boolean isAvailable(String vehicleId, Date dateDebut, Date dateFin) {
        // if empty list => no trip in the specified interval => available
        List<Voyage> voyages = vehiculeRepository.getVoyagesByInterval(dateDebut, dateFin);
        return voyages.isEmpty();
    }
}
