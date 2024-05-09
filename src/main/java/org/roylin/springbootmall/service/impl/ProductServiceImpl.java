package org.roylin.springbootmall.service.impl;

import org.roylin.springbootmall.dao.ProductDao;
import org.roylin.springbootmall.model.Product;
import org.roylin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
