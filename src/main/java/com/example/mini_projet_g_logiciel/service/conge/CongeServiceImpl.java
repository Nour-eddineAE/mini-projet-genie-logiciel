package com.example.mini_projet_g_logiciel.service.conge;

import com.example.mini_projet_g_logiciel.dao.CongeRepository;
import com.example.mini_projet_g_logiciel.entities.Conge;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeServiceImpl implements CongeService{
    private CongeRepository congeRepository;

    public CongeServiceImpl(){}

    public CongeServiceImpl(CongeRepository congeRepository){
        this.congeRepository = congeRepository;
    }

    @Override
    public List<Conge> getCongeByConducteur(String driverId) {
        return this.congeRepository.getCongesByConducteur(driverId);
    }

    @Override
    public List<Conge> getAllConge() {
        return this.congeRepository.findAll();
    }

    @Override
    public Conge getCongeById(String codeConge) {
        Conge conge = this.congeRepository.findById(codeConge).orElse(null);
        if(conge == null){
            throw new RuntimeException("Conge with specified id not found");
        }
        return conge;
    }

    @Override
    public Conge saveConge(Conge conge) {
        return this.congeRepository.save(conge);
    }

    @Override
    public void removeConge(String codeConge) {
        this.congeRepository.deleteById(codeConge);
    }
}
