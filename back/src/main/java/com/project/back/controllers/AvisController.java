package com.project.back.controllers;



import com.project.back.models.Avis;
import com.project.back.services.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/avis")
public class AvisController {
    @Autowired
    private AvisService avisService;

    @PostMapping("/ajouter")
    public Avis createAvis(@RequestBody Avis avis){
        return avisService.createAvis(avis);
    }
    @GetMapping("/")
    public List<Avis> getAvis(){
        return avisService.getAllAvis();
    }
    @PutMapping("/modifier/{id}")
    public Avis updateAvis(@PathVariable String id,@RequestBody Avis avis){
        return avisService.updateAvis(id,avis);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAvis(@PathVariable String id){
        return avisService.deleteAvis(id);
    }
}
