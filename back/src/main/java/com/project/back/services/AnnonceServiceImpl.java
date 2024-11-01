package com.project.back.services;

import com.project.back.models.Annonce;
import com.project.back.repositories.AnnonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnonceServiceImpl implements AnnonceService{
    @Autowired
    AnnonceRepository annonceRepository;
    @Override
    public List<Annonce> getAllAnnonce() {
        return annonceRepository.findAll();
    }

    @Override
    public Annonce createAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    @Override
    public Annonce updateAnnonce(String id, Annonce annonce) {
        annonce.setId(id);
        return annonceRepository.save(annonce);
    }

    @Override
    public String deleteAnnonce(String id) {
        annonceRepository.deleteById(id);
        return "annonce deleted with id: "+id;
    }

    @Override
    public Optional<Annonce> getAnnonceById(String id) {
        return annonceRepository.findById(id);
    }
}
