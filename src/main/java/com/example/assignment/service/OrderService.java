package com.example.assignment.service;

import com.example.assignment.model.OrderUser;
import com.example.assignment.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String addOrder(OrderUser orderUser) {
        iOrderRepo.save(orderUser);
        return "Add successfull !!";
    }

    public Optional<OrderUser> getOrderById(Integer id) {
        return iOrderRepo.findById(id);

    }
}
