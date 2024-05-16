package org.roylin.springbootmall.service.impl;

import org.roylin.springbootmall.dao.ProductDao;
import org.roylin.springbootmall.dto.ProductQueryParam;
import org.roylin.springbootmall.dto.ProductRequest;
import org.roylin.springbootmall.model.Product;
import org.roylin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Integer countProduct(ProductQueryParam productQueryParam) {
        return productDao.countProduct(productQueryParam);
    }

    @Override
    public List<Product> getProducts(ProductQueryParam productQueryParam) {
        return productDao.getProducts(productQueryParam);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
