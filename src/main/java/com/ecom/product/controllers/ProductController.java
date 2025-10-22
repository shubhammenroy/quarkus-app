package com.ecom.product.controllers;

import java.util.List;

import com.ecom.product.entities.Product;
import com.ecom.product.services.ProductService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GET
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @POST
    public Product createProduct(Product product) {
        return productService.addProduct(product);
    }

}
