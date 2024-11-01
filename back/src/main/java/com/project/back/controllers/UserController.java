package com.project.back.controllers;

import com.project.back.models.User;
import com.project.back.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUser();
    }
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable String id,@RequestBody User user){
        return userService.updateUser(id, user);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id){
        return userService.deleteUser(id);
    }

}
