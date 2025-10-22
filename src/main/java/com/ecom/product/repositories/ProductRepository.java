package com.ecom.product.repositories;
import com.ecom.product.entities.Product;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductRepository extends InMemoryRepository<Product> {
    public ProductRepository() {
        super(Product::getId);
    }
}
