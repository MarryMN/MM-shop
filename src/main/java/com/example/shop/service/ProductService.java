package com.example.shop.service;

import java.util.List;

import com.example.shop.domain.Product;

public interface ProductService {
    void save(Product product);

    void edit(long id, Product newProduct);

    void delete(long id);

    Product findById(long id);

    List<Product> findAllByOrderByIdAsc();

    long count();
}
