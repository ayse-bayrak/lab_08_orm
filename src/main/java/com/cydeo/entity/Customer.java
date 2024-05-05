package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.List;

@Entity
@Table(name="customer") // it is best practice because it can change database and rule is changed
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity {
    private String email;

    @Column(name ="first_name") // it is best practice because it can change database and rule is changed
    private String firstName;
    private String lastName;
    private String userName;

    public Customer(String email, String firstName, String lastName, String userName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }
}
