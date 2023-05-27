package com.pangan.sarisaristore;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product addProduct(Product product);
    Product getProductById(int id);
    Product updateProduct(Product product);
    Product deleteProductById(int id);
}
