package com.example.mini_projet_g_logiciel.service.assurance;

import com.example.mini_projet_g_logiciel.entities.Assurance;

import java.util.List;

public interface AssuranceService {
    List<Assurance> getAllAssurances();
    Assurance getAssuranceById(String assuranceId);
    Assurance saveAsurance(Assurance  assurance);
    void deleteAssurance(String assuranceId);
}
