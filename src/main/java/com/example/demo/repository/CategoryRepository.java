package com.example.demo.repository;

import com.example.demo.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity , Long> {
    Optional<CategoryEntity> findByName(String name);
}
