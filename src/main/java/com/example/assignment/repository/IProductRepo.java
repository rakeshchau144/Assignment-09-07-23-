package com.example.assignment.repository;

import com.example.assignment.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
}
