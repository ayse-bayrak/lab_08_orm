package com.cydeo.entity;

import com.cydeo.enums.CartState;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Discount discount;

//    @OneToOne
//    private Order order;  // lab_09_query it does not, it is no necesaary because in the table it is not.

    @ManyToMany
    @JoinTable(name = "product_category_rel",
            joinColumns = @JoinColumn(name="p_id"),
            inverseJoinColumns = @JoinColumn(name="c_id"))
    private List<Product> productList;
}
