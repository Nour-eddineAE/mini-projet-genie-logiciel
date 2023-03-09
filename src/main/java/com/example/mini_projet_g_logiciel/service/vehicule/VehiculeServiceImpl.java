package com.example.mini_projet_g_logiciel.service.vehicule;

import com.example.mini_projet_g_logiciel.dao.VehiculeRepository;
import com.example.mini_projet_g_logiciel.entities.Vehicule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService {
    private VehiculeRepository vehiculeRepository;

    public VehiculeServiceImpl() {

    }

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
}
