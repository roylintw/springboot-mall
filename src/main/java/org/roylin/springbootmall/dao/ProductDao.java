package org.roylin.springbootmall.dao;

import org.roylin.springbootmall.dto.ProductQueryParam;
import org.roylin.springbootmall.dto.ProductRequest;
import org.roylin.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    // 11-14
    Integer countProduct(ProductQueryParam productQueryParam);

    List<Product> getProducts(ProductQueryParam productQueryParam);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
