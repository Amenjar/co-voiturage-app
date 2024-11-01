package com.project.back.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;


@Data
@Getter
@Setter
@ToString
@Document(collection = "annonces")
public class Annonce {
    @Id
    private String id;
    @NotNull
    private String cin;
    private String dateDeDepart;
    private Double nbrPlace;
    private String lieuDepart;
    private String lieuDarrivee;
    private String typeTrajet;
    private String heurdepart;
    private String description;
    private String aller_retour;
    private String regulier;
    private Double prix;
    @DBRef
    private User user;

    public Annonce(String cin,String dateDeDepart, Double nbrPlace, String lieuDepart, String lieuDarrivee, String typeTrajet, String heurdepart, String description, String aller_retour, String regulier, Double prix, User user) {
        this.cin = cin;
        this.dateDeDepart = dateDeDepart;
        this.nbrPlace = nbrPlace;
        this.lieuDepart = lieuDepart;
        this.lieuDarrivee = lieuDarrivee;
        this.typeTrajet = typeTrajet;
        this.heurdepart = heurdepart;
        this.description = description;
        this.aller_retour = aller_retour;
        this.regulier = regulier;
        this.prix = prix;
        this.user = user;
    }
}