package com.example.productsvc.service;

import com.example.productsvc.dto.ProductRequest;
import com.exampple.productsvc.model.Product;

import java.util.List;

public interface ProductService {
    Product create(ProductRequest request);
    Product findById(Long id);
    List<Product> findAll();
    Product update(Long id, ProductRequest request);
    void delete(Long id);
}