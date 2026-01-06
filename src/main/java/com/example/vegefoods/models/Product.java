package com.example.vegefoods.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageUrl;
    private Double price;
    private Integer discountPrice;
    private Integer saleCount;
    private String description;
    private Integer count;
    private Double stockWeight;
    private LocalDateTime created;

    @ManyToOne
    private Category category;


}
