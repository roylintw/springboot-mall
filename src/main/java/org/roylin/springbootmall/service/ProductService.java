package org.roylin.springbootmall.service;

import org.roylin.springbootmall.dto.ProductRequest;
import org.roylin.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
