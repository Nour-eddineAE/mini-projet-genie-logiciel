package com.example.mini_projet_g_logiciel.service.conducteur;

import com.example.mini_projet_g_logiciel.dao.ConductorRepository;
import com.example.mini_projet_g_logiciel.entities.Conducteur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConducteurServiceImpl implements ConducteurService {
    private ConductorRepository conductorRepository;

    public ConducteurServiceImpl() {
    }

    public ConducteurServiceImpl(ConductorRepository conductorRepository) {
        this.conductorRepository = conductorRepository;
    }

    @Override
    public List<Conducteur> getAvaiblableDrivers() {
        //TODO
        return null;
    }

    @Override
    public List<Conducteur> getAllDrivers() {
        return conductorRepository.findAll();
    }

    @Override
    public Conducteur getDriverById(String driverId) {
        Conducteur conducteur = conductorRepository.findById(driverId).orElse(null);
        if (conducteur == null) {
            throw new RuntimeException("No driver with such id");
        }
        return conducteur;
    }

    @Override
    public Conducteur saveDriver(Conducteur conducteur) {
        return conductorRepository.save(conducteur);
    }

    @Override
    public void removeDriver(String driverId) {
        conductorRepository.deleteById(driverId);
    }
}
