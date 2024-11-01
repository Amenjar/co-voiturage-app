package com.project.back.repositories;

import com.project.back.models.Voiture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoitureRepository extends MongoRepository<Voiture,String> {
}
