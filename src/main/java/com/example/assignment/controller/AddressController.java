package com.example.assignment.controller;

import com.example.assignment.model.Address;
import com.example.assignment.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("address/add")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
}
