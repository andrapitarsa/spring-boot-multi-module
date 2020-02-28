package com.example.StartUpInit;

import com.example.domain.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Init {

    @Autowired
    ProductService productService;

    @PostConstruct
    public void saveProduct() {
        Product product = new Product();
        product.setId(1003);
        product.setName("Oreo");
        product.setDescription("Snake");

        productService.saveProduct(product);
    }
}
