package com.project.back.payload.response;

import com.project.back.models.Voiture;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

public class UserInfoResponse {
    private String id;
    private String username;
    private String prenom;
    private String picture;

    private String tel;


    private String genre;


    private String cin;

    private String permis;
    private String note;
    private String adress;

    public String getPassword() {
        return password;
    }

    private String email;
    private String password;
    private List<String> roles;



    private List<Voiture> voiture;

    public UserInfoResponse(String id, String username, String prenom,String picture, String tel, String genre, String cin, String permis, String note, String adress, String email, String password,List<String> roles) {
        this.id = id;
        this.username = username;
        this.prenom = prenom;
        this.picture= picture;
        this.tel = tel;
        this.genre = genre;
        this.cin = cin;
        this.permis = permis;
        this.note = note;
        this.adress = adress;
        this.email = email;
        this.password = password;
        this.roles = roles;
        //this.voiture = voiture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }

    public String getGenre() {
        return genre;
    }

    public String getCin() {
        return cin;
    }

    public String getPermis() {
        return permis;
    }

    public String getNote() {
        return note;
    }

    public String getAdress() {
        return adress;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<Voiture> getVoiture() {
        return voiture;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }
}