package com.example.demo.repository;

import com.example.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByNameIgnoreCase(String name);
    // Método personalizado para buscar productos cuyo nombre contenga una cadena
    List<Product> findByNameContaining(String name);

}
