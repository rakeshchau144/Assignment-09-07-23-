package com.example.assignment.service;

import com.example.assignment.model.OrderUser;
import com.example.assignment.model.Product;
import com.example.assignment.model.User;
import com.example.assignment.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String addUser(User user) {
        iUserRepo.save(user);
        return "User Add successfull";
    }

    public Optional<User> getUserById(Integer id) {
        return iUserRepo.findById(id);
    }

}
