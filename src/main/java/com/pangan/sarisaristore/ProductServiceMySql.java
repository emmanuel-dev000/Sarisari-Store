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

    public Product addProduct(Product product) {
        return  _productRepository.save(product);
    }

    public  Product getProductById(int id) {
        return _productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found"));
    }
}
