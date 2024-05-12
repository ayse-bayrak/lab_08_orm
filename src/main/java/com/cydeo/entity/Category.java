package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity{

    private String name;

    //private List<Product> productList;//1000000

}
/*
    Bağlantı Tablosu Kullanarak (Join Table): Birçok-çok (many-to-many) ilişkilerde kullanılır.
    İki tablo arasındaki ilişkiyi temsil etmek için bir bağlantı tablosu oluşturulur.
    Bu tablo, her iki tablonun anahtarlarını içerir
    ve her iki tablo arasındaki ilişkiyi tanımlar.
     */
