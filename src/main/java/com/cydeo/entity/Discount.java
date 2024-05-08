package com.cydeo.entity;

import com.cydeo.enums.DiscountType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Discount extends BaseEntity{

    private BigDecimal discount;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
    private String name;

}
