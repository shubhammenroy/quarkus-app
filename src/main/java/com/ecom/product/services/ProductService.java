package com.ecom.product.services;

import java.util.List;

import com.ecom.product.entities.Product;
import com.ecom.product.repositories.ProductRepository;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
@ApplicationScoped
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product addProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return List.copyOf(productRepository.findAll());
    }

    
}
