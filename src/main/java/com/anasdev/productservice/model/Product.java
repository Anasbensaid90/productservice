package com.anasdev.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
public class Product {


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private long quantity;
    private double unitPrice;
}
