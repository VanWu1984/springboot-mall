package com.vanwu.springbootmall.service;

import com.vanwu.springbootmall.dto.ProductRequest;
import com.vanwu.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
