package com.vanwu.springbootmall.service;

import com.vanwu.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
}