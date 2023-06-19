package net.fernandosalas.springboot.service;

import net.fernandosalas.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
