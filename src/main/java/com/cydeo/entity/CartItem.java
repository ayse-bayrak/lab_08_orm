package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CartItem extends BaseEntity{
    private int quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;

}
