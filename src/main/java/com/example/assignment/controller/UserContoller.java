package com.example.assignment.controller;

import com.example.assignment.model.OrderUser;
import com.example.assignment.model.Product;
import com.example.assignment.model.User;
import com.example.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserContoller {
    @Autowired
    UserService userService;
    @PostMapping("user/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("user/id/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }




}
