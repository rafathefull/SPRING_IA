package com.example.demo.service;

import com.example.demo.Entity.Product;
import com.example.demo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public Product findProductByName(String name) {
        return productRepository.findByNameIgnoreCase(name);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> findAllProducts(String name) {
        return productRepository.findByNameContaining(name);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
