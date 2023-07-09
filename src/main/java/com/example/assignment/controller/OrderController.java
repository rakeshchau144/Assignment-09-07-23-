package com.example.assignment.controller;

import com.example.assignment.model.OrderUser;
import com.example.assignment.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("order/add")
    public String addOrder(@RequestBody OrderUser orderUser){
        return orderService.addOrder(orderUser);
    }
    @GetMapping("order/id/{id}")
    public Optional<OrderUser> getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

}
