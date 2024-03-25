package com.vanwu.springbootmall.service;

import com.vanwu.springbootmall.dto.ProductRequest;
import com.vanwu.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
