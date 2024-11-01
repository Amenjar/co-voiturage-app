package com.project.back.repositories;

import com.project.back.models.Avis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AvisRepository extends MongoRepository<Avis,String> {
}
