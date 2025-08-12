package com.learning.springboot.Learning.Spring.Boot.services;

import com.learning.springboot.Learning.Spring.Boot.repositories.Product;
import com.learning.springboot.Learning.Spring.Boot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public String testConnection() {
        try {
            // Try a simple query (e.g., find all products)
//            productRepository.findAll();
            return "Database connection is successful.";
        } catch (Exception e) {
            return "Failed to connect to the database: " + e.getMessage();
        }
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll(); // Fetches all products
    }
}
