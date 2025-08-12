package com.example.restapi.controller;

import com.example.restapi.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private Map<Long, Product> productMap = new HashMap<>();

    @PostMapping
    public String addProduct(@RequestBody Product product) {
        productMap.put(product.getId(), product);
        return "Product added successfully!";
    }  
    @GetMapping
    public Collection<Product> getAllProducts() {
        return productMap.values();
    }  
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        if (!productMap.containsKey(id)) {
            return "Product not found!";
        }
        updatedProduct.setId(id);
        productMap.put(id, updatedProduct);
        
        return "Product updated successfully!";
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        if (productMap.remove(id) != null) {
            return "Product deleted successfully!";
        } else {
            return "Product not found!";
        }
    }
}