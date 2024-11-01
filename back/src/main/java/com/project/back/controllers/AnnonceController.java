package com.project.back.controllers;


import com.project.back.models.Annonce;
import com.project.back.payload.request.AnnonceRequest;
import com.project.back.services.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "/api/annonce")
public class AnnonceController {
    @Autowired
    AnnonceService annonceService;

    @PostMapping("/ajouter")
    public ResponseEntity<Annonce> ajouterAnnonce(@RequestBody AnnonceRequest annonceRequest){
        Annonce annonce = new Annonce (
                annonceRequest.getCin(),
                annonceRequest.getDateDeDepart(),
                annonceRequest.getNbrPlace(),
                annonceRequest.getLieuDepart(),
                annonceRequest.getLieuDarrivee(),
                annonceRequest.getTypeTrajet(),
                annonceRequest.getHeurdepart(),
                annonceRequest.getDescription(),
                annonceRequest.getAller_retour(),
                annonceRequest.getRegulier(),
                annonceRequest.getPrix(),
                annonceRequest.getUser()
        );
        Annonce annonceCreated = annonceService.createAnnonce(annonce);
        return new ResponseEntity<Annonce>(annonceCreated, HttpStatus.CREATED);
    }
    @GetMapping("/getAll")
    public List<Annonce> getAllAnnonce(){
        return annonceService.getAllAnnonce();
    }
    @GetMapping("/{id}")
    public Optional<Annonce> getAnnoce(@PathVariable String id){
        return annonceService.getAnnonceById(id);
    }
    @PutMapping("/modifier/{id}")
    public ResponseEntity<Annonce> modifierAnnonce(@PathVariable String id, @RequestBody Annonce annonce){
        Annonce annonceUpdated = annonceService.updateAnnonce(id,annonce);
        return ResponseEntity.ok().body(annonceUpdated);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAnnonce(@PathVariable String id){
        return annonceService.deleteAnnonce(id);
    }




}
