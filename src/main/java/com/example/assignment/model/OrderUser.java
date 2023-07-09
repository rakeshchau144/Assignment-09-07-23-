package com.example.assignment.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User userfkId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "fk_product_order_id",joinColumns =@JoinColumn(name ="fk_order_id"), inverseJoinColumns = @JoinColumn(name = "fk_product_id"))
    private List<Product> productsfktId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id")
    private  Address addressfkId;

    private Integer quantity;
}
