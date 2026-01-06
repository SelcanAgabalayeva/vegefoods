package com.example.vegefoods.repositories;

import com.example.vegefoods.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
