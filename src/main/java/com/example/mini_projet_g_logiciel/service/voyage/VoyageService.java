package com.example.mini_projet_g_logiciel.service.voyage;

import com.example.mini_projet_g_logiciel.entities.Voyage;

import java.util.List;

public interface VoyageService {
    List<Voyage> getAllTrips();
    Voyage getTripById(String tripId);
    Voyage saveTrip(Voyage  voyage);
    void deleteTrip(String tripId);
}
