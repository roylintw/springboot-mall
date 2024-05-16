package org.roylin.springbootmall.service;

import org.roylin.springbootmall.constant.ProductCategory;
import org.roylin.springbootmall.dto.ProductRequest;
import org.roylin.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
