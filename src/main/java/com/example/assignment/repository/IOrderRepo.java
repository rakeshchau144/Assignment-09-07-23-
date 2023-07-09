package com.example.assignment.repository;

import com.example.assignment.model.OrderUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<OrderUser,Integer> {
}
