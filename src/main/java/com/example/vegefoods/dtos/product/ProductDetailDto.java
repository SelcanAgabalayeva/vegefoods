package com.example.vegefoods.dtos.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailDto {
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
}
