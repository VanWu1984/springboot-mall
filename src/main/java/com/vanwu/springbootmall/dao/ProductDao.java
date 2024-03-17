package com.vanwu.springbootmall.dao;

import com.vanwu.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
