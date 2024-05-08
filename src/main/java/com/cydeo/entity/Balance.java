package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name="balance")
@Getter
@Setter
@NoArgsConstructor
public class Balance extends BaseEntity {

    @Column(precision = 19, scale = 2) //in table numeric (19,2) total digits can be 19 digits,and after comma it can be 2 digits
    private BigDecimal amount;

    //first part general total digits of numbers, second part how many numbers you see after main amount

    @OneToOne
    //@JoinColumn(name = "customer_id") // it is better to write like this
    private Customer customer;
}
