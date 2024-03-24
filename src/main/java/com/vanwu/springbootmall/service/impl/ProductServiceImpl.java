package com.vanwu.springbootmall.service.impl;

import com.vanwu.springbootmall.dao.ProductDao;
import com.vanwu.springbootmall.dto.ProductRequest;
import com.vanwu.springbootmall.model.Product;
import com.vanwu.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }


}
