package com.example.sistemadigestioneprodotti.controllers;

import com.example.sistemadigestioneprodotti.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ProductController {
    @PostMapping("/create")
    public ResponseEntity createProduct(@RequestBody Product product) {
        return ResponseEntity.ok().body(product);
    }
}
