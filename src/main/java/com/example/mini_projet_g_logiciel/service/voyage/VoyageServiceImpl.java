package com.example.mini_projet_g_logiciel.service.voyage;

import com.example.mini_projet_g_logiciel.dao.VoyageRepository;
import com.example.mini_projet_g_logiciel.entities.Voyage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoyageServiceImpl implements VoyageService{
    private VoyageRepository voyageRepository;

    public VoyageServiceImpl() {
    }
    public VoyageServiceImpl(VoyageRepository voyageRepository) {
        this.voyageRepository = voyageRepository;
    }
    @Override
    public List<Voyage> getAllTrips() {
        return voyageRepository.findAll();
    }

    @Override
    public Voyage getTripById(String tripId) {
        Voyage voyage = voyageRepository.findById(tripId).orElse(null);
        if (voyage == null) throw new RuntimeException("No trip with the given Id");
        return voyage;
    }

    @Override
    public Voyage saveTrip(Voyage voyage) {
        return voyageRepository.save(voyage);
    }

    @Override
    public void deleteTrip(String tripId) {
        voyageRepository.deleteById(tripId);
    }
}
