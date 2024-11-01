package com.project.back.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Getter
@Setter
@ToString
@Document(collection = "voitures")
public class Voiture {
    @Id
    private String id;
    private String plaque_imatriculation;
    private String coleur;
    private String type;
    private String date_imatriculation;
    private String user_id;
    private String marque;
    private String logo;
    private String model;
    @DBRef
    private User user;

}
