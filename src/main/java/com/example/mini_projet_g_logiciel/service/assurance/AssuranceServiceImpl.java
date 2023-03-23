package com.example.mini_projet_g_logiciel.service.assurance;

import com.example.mini_projet_g_logiciel.dao.AssuranceRepository;
import com.example.mini_projet_g_logiciel.entities.Assurance;

import java.util.List;

public class AssuranceServiceImpl implements AssuranceService {
    private AssuranceRepository assuranceRepository;
    public AssuranceServiceImpl(AssuranceRepository assuranceRepository) {
        this.assuranceRepository = assuranceRepository;
    }
    @Override
    public List<Assurance> getAllAssurances() {
        return this.assuranceRepository.findAll();
    }

    @Override
    public Assurance getAssuranceById(String assuranceId) {
        Assurance assurance = this.assuranceRepository.findById(assuranceId).orElse(null);
        if(assurance == null) throw new RuntimeException("No assurance with the given id");
        return assurance;
    }

    @Override
    public Assurance saveAsurance(Assurance assurance) {
        return this.assuranceRepository.save(assurance);
    }

    @Override
    public void deleteAssurance(String assuranceId) {
        this.assuranceRepository.deleteById(assuranceId);
    }
}
