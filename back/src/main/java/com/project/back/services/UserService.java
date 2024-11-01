package com.project.back.services;

import com.project.back.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();
    User updateUser(String id, User user);
    String deleteUser(String id);
    Optional<User> getUserById(String id);
}
