package com.example.testdatabase.repositories;

import com.example.testdatabase.entites.ProductView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductViewRepository extends JpaRepository<ProductView, Long> {
}
