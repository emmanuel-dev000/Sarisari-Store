package com.pangan.sarisaristore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService _productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return _productService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return _productService.addProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@RequestParam int id) {
        return _productService.getProductById(id);
    }
}
