package com.project.back.repositories;

import com.project.back.models.Annonce;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnnonceRepository extends MongoRepository<Annonce,String> {
}
