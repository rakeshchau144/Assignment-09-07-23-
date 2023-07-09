package com.example.assignment.service;

import com.example.assignment.model.Address;
import com.example.assignment.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Add Address Successfully !!";
    }
}
