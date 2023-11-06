package com.ichwan.basic.service;

import com.ichwan.basic.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }
}
