package com.example.productsvc.controller;

import com.example.productsvc.dto.ProductRequest;
import com.example.productsvc.service.ProductService;
import com.exampple.productsvc.model.Product;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@Validated                  
public class ProductController {

    private final ProductService service;
    public ProductController(ProductService service) { this.service = service; }

    @GetMapping
    public List<Product> listAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product getOne(@PathVariable @Min(value = 1, message = "Id must be >= 1") Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<Product> create(@Valid @RequestBody ProductRequest request) {
        Product created = service.create(request);
        return ResponseEntity.created(URI.create("/api/products/" + created.getId())).body(created);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable @Min(value = 1, message = "Id must be >= 1") Long id,
                          @Valid @RequestBody ProductRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable @Min(value = 1, message = "Id must be >= 1") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}