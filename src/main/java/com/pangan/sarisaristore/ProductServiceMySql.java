package com.pangan.sarisaristore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceMySql implements ProductService {

    private final NullProduct NULL_PRODUCT = new NullProduct();
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

    public Product updateProduct(Product updatedProduct) {
        Product product = _productRepository.findById(updatedProduct.getId())
                .orElseThrow(() -> new NotFoundException("Product is not found"));
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        return _productRepository.save(product);
    }

    public Product deleteProductById(int id) {
        _productRepository.deleteById(id);
        return NULL_PRODUCT;
    }
}
