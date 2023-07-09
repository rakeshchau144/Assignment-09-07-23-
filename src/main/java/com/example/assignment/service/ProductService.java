package com.example.assignment.service;

import com.example.assignment.model.Product;
import com.example.assignment.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public  String addProduct(Product product) {
        iProductRepo.save(product);
        return "Add successfull";
    }

    public Iterable<Product> getAllProducts() {
        return iProductRepo.findAll();
    }

    public String deleteById(Integer id) {
        iProductRepo.deleteById(id);
        return "Deleted id no "+id;
    }
}
