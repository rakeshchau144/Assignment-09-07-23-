package com.example.assignment.model;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipCode;
    private String state;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User user;
    }
