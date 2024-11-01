package com.project.back.services;


import com.project.back.models.Avis;
import com.project.back.repositories.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisServiceImpl implements AvisService {
    @Autowired
    AvisRepository avisRepository;
    @Override
    public List<Avis> getAllAvis() {
        return avisRepository.findAll();
    }

    @Override
    public Avis createAvis(Avis avis) {
        return avisRepository.save(avis);
    }

    @Override
    public Avis updateAvis(String id, Avis avis) {
        avis.setId(id);
        return avisRepository.save(avis);
    }

    @Override
    public String deleteAvis(String id) {
        avisRepository.deleteById(id);
        return "delete avis with id : "+id;
    }
}
