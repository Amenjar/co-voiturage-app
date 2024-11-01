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
@Document(collection = "avis")
public class Avis {
    @Id
    private String id;
    private String rating;
    @DBRef
    private User user ;
    @DBRef
    private Annonce annonce;
}
