package com.example.assignment.controller;

import com.example.assignment.model.Product;
import com.example.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("product/add")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("products")
    public Iterable<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("product/delete/id/{id}")
    public String deleteById(@PathVariable Integer id){
        return productService.deleteById(id);
    }

}
