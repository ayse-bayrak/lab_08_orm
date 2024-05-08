package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category extends BaseEntity{

    private String name;

    @ManyToMany
    @JoinTable(name = "product_category_rel",
            joinColumns = @JoinColumn(name="c_id"),
            inverseJoinColumns = @JoinColumn(name="p_id"))
    private List<Product> productList;

    /*
    Bağlantı Tablosu Kullanarak (Join Table): Birçok-çok (many-to-many) ilişkilerde kullanılır.
    İki tablo arasındaki ilişkiyi temsil etmek için bir bağlantı tablosu oluşturulur.
    Bu tablo, her iki tablonun anahtarlarını içerir
    ve her iki tablo arasındaki ilişkiyi tanımlar.
     */


}
