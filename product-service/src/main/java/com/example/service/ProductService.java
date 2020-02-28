package com.example.service;

import com.example.domain.Product;
import com.example.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public List<Product> findProductById(Integer id) {
        return productRepository.findProductById(id);
    }

    public List<Product> findProductByName(String name) {
        return productRepository.findProductByName(name);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
