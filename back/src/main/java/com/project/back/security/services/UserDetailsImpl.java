package com.project.back.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.project.back.models.Voiture;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.project.back.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {
    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String email;

    private String prenom;
    private String picture;


    private String tel;


    private String genre;


    private String cin;

    private String permis;
    private String note;
    private String adress;

    @JsonIgnore
    private String password;

    //private List<Voiture> voiture;

    private Collection<? extends GrantedAuthority> authorities;

 /*   public UserDetailsImpl(String id, String username, String email, String password,
                           Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }*/

    public UserDetailsImpl(String id, String username, String email, String prenom,String picture, String tel, String genre, String cin, String permis, String note, String adress, String password,Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.prenom = prenom;
        this.picture = picture;
        this.tel = tel;
        this.genre = genre;
        this.cin = cin;
        this.permis = permis;
        this.note = note;
        this.adress = adress;
        this.password = password;
        //this.voiture = voiture;
        this.authorities = authorities;
    }

    public static UserDetailsImpl build(User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName().name()))
                .collect(Collectors.toList());

        return new UserDetailsImpl(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPrenom(),
                user.getPicture(),
                user.getTel(),
                user.getGenre(),
                user.getCin(),
                user.getPermis(),
                user.getNote(),
                user.getAdress(),
                user.getPassword(),
                authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
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



    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserDetailsImpl user = (UserDetailsImpl) o;
        return Objects.equals(id, user.id);
    }

    public String getPicture() {
        return picture;
    }
}

