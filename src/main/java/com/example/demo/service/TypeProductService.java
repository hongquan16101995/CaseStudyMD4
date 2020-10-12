package com.example.demo.service;

import com.quan.demo.models.TypeProduct;

public interface TypeProductService {
    Iterable<TypeProduct> findAll();

    TypeProduct getTypeProduct(Long id);
}
