package com.example.productsvc.service;

import com.example.productsvc.dto.ProductRequest;
import com.example.productsvc.exception.NotFoundException;
import com.exampple.productsvc.model.Product;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductServiceImpl implements ProductService {

    private final Map<Long, Product> store = new ConcurrentHashMap<>();
    private final AtomicLong idSeq = new AtomicLong(0);

    @Override
    public Product create(ProductRequest request) {
        Long id = idSeq.incrementAndGet();
        Product p = new Product(id, request.getName(), request.getDescription(), request.getPrice());
        store.put(id, p);
        return p;
    }

    @Override
    public Product findById(Long id) {
        Product p = store.get(id);
        if (p == null) throw new NotFoundException("Product with id " + id + " not found");
        return p;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Product update(Long id, ProductRequest request) {
        Product existing = store.get(id);
        if (existing == null) throw new NotFoundException("Product with id " + id + " not found");
        existing.setName(request.getName());
        existing.setDescription(request.getDescription());
        existing.setPrice(request.getPrice());
        return existing;
    }

    @Override
    public void delete(Long id) {
        Product removed = store.remove(id);
        if (removed == null) throw new NotFoundException("Product with id " + id + " not found");
    }
}