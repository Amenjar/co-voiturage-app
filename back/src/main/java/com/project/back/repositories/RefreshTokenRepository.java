package com.project.back.repositories;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.back.models.RefreshToken;
import com.project.back.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RefreshTokenRepository extends MongoRepository<RefreshToken,String> {
    Optional<RefreshToken> findByToken(String token);

    @JsonIgnore
    int deleteByUser(User user);
}
