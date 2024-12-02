package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UserService;
import com.example.demo.model.User;

@RestController
@RequestMapping("/api/registration")
@CrossOrigin(origins = "http://localhost:3000/registration")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User registUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
