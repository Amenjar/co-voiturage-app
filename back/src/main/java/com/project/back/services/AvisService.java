package com.project.back.services;

import com.project.back.models.Avis;

import java.util.List;

public interface AvisService {
    List<Avis> getAllAvis();
    Avis createAvis(Avis avis);
    Avis updateAvis(String id , Avis avis);
    String deleteAvis(String id);
}
