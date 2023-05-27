package com.pangan.sarisaristore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceMySql implements ProductService {
    @Autowired
    private ProductRepository _productRepository;

    public List<Product> getAllProducts() {
        return _productRepository.findAll();
    }
}
