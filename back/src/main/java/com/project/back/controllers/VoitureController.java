package com.project.back.controllers;


import com.project.back.models.Voiture;

import com.project.back.services.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/voiture")
public class VoitureController {
    @Autowired
    private VoitureService voitureService;


    @PostMapping("/ajouter")
    public Voiture createVoiture(@RequestBody Voiture voiture){
        return voitureService.createVoiture(voiture);
    }
    @PutMapping("/modifier/{id}")
    public Voiture updateVoiture(@PathVariable String id,@RequestBody Voiture voiture){
        return voitureService.updateVoiture(id,voiture);
    }
    @GetMapping("/voitures")
    public List<Voiture> getVoitures(){
        return voitureService.getAllVoitures();
    }
    @GetMapping("/{id}")
    public Optional<Voiture> getOneVoiture(@PathVariable String id){
        return voitureService.getVoiture(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteVoiture(@PathVariable String id){
        return voitureService.deleteVoiture(id);
    }
}
