package com.example.controller;

import com.example.domain.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAll() {
        return productService.getProducts();
    }

    @GetMapping("/productshello")
    public String hello() {
        return "Hello world, heloo 00999 dkfa Hello world";
    }

    @GetMapping("/products/{id}")
    public List<Product> getProductById(@PathVariable Integer id) {
        return productService.findProductById(id);
    }

    @GetMapping("/products/name/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        return productService.findProductByName(name);
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
