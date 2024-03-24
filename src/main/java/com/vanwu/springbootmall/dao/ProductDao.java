package com.vanwu.springbootmall.dao;

import com.vanwu.springbootmall.dto.ProductRequest;
import com.vanwu.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
