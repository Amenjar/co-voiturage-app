package com.project.back.services;

import com.project.back.models.Voiture;
import com.project.back.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoitureServiceImpl implements VoitureService{
    @Autowired
    private VoitureRepository voitureRepository;
    @Override
    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    @Override
    public Optional<Voiture> getVoiture(String id) {
        return voitureRepository.findById(id);
    }

    @Override
    public Voiture createVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Override
    public Voiture updateVoiture(String id, Voiture voiture) {
        voiture.setId(id);
        return voitureRepository.save(voiture);
    }

    @Override
    public String deleteVoiture(String id) {
        voitureRepository.deleteById(id);
        return "delete voiture with id : "+id;
    }
}
