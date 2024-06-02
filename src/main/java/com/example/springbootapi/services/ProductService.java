package com.example.springbootapi.services;

import com.example.springbootapi.model.ProductModel;
import com.example.springbootapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductModel getProductById(UUID id){
        return productRepository.findById(id).orElse(null);
    }
}
