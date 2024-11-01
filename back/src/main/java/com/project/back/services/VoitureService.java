package com.project.back.services;

import com.project.back.models.Voiture;

import java.util.List;
import java.util.Optional;

public interface VoitureService {
    List<Voiture> getAllVoitures();
    Optional<Voiture> getVoiture(String id);
    Voiture createVoiture(Voiture voiture);
    Voiture updateVoiture(String id,Voiture voiture);
    String deleteVoiture(String id);
}
