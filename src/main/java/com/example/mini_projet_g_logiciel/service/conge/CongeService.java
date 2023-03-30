package com.example.mini_projet_g_logiciel.service.conge;

import com.example.mini_projet_g_logiciel.entities.Conge;

import java.util.List;

public interface CongeService {
    public List<Conge> getCongeByConducteur(String driverId);
    public List<Conge> getAllConge();
    public Conge getCongeById(String codeConge);
    public Conge saveConge(Conge conge);

    void removeConge(String codeConge);
}
