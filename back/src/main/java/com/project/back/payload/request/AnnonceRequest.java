package com.project.back.payload.request;

import com.project.back.models.User;

public class AnnonceRequest {
    private String cin;
    private String dateDeDepart;
    private Double nbrPlace;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    private String lieuDepart;
    private String lieuDarrivee;
    private String typeTrajet;
    private String heurdepart;
    private String description;
    private String aller_retour;
    private String regulier;
    private Double prix;

    public String getDateDeDepart() {
        return dateDeDepart;
    }

    public void setDateDeDepart(String dateDeDepart) {
        this.dateDeDepart = dateDeDepart;
    }

    public Double getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(Double nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public String getLieuDarrivee() {
        return lieuDarrivee;
    }

    public void setLieuDarrivee(String lieuDarrivee) {
        this.lieuDarrivee = lieuDarrivee;
    }

    public String getTypeTrajet() {
        return typeTrajet;
    }

    public void setTypeTrajet(String typeTrajet) {
        this.typeTrajet = typeTrajet;
    }

    public String getHeurdepart() {
        return heurdepart;
    }

    public void setHeurdepart(String heurdepart) {
        this.heurdepart = heurdepart;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAller_retour() {
        return aller_retour;
    }

    public void setAller_retour(String aller_retour) {
        this.aller_retour = aller_retour;
    }

    public String getRegulier() {
        return regulier;
    }

    public void setRegulier(String regulier) {
        this.regulier = regulier;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
}
