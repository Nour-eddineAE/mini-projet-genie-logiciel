package com.example.mini_projet_g_logiciel.service.disponibilité;

import java.util.Date;

public interface AvailabilityService {
    boolean isVehicleAvailable(String vehicleId, Date dateDebut, Date dateFin);
    boolean isDriverAvailable(String driverId, String vehicleId, Date dateDebut, Date dateFin);
}
