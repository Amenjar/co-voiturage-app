package com.project.back.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Getter
@Setter
@ToString
@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private String identifiantConducteur;
    private Date dateReservation;
    private Integer nbrPlace;
    private String lieuDepart;
    private String lieuDarrivee;
    private Boolean validity;
    private EEtat etat;
    private Double prix;
    @DBRef
    private Annonce annonce;
    @DBRef
    private User user;
}
