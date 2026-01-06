package com.example.vegefoods.repositories;

import com.example.vegefoods.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
