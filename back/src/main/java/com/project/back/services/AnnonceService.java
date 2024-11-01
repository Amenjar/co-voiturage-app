package com.project.back.services;

import com.project.back.models.Annonce;

import java.util.List;
import java.util.Optional;

public interface AnnonceService {
    List<Annonce> getAllAnnonce();
    Annonce createAnnonce(Annonce annonce);
    Annonce updateAnnonce(String id,Annonce annonce);
    String deleteAnnonce(String id);
    Optional<Annonce> getAnnonceById(String id);
}
