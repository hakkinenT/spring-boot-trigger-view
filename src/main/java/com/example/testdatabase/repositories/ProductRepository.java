package com.example.testdatabase.repositories;


import com.example.testdatabase.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
