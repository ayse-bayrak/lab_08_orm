package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Order extends BaseEntity{

    private BigDecimal paidPrice;
    private BigDecimal totalPrice;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Cart cart;

    @OneToOne
    private Payment payment;
}
