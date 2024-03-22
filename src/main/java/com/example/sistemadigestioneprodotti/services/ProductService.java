package com.example.sistemadigestioneprodotti.services;

import com.example.sistemadigestioneprodotti.entities.Product;
import com.example.sistemadigestioneprodotti.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product addProduct(Product product) {
        productRepository.save(product);
        return product;
    }

}
