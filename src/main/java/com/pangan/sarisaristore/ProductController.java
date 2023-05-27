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

    @GetMapping("/product")
    public Product getProductById(@RequestParam("id") int id) {
        return _productService.getProductById(id);
    }

    // TODO: Make this into PutMapping instead
    @PostMapping("/product/update")
    public  Product updateProduct(@RequestBody Product product) {
        return _productService.updateProduct(product);
    }
}
