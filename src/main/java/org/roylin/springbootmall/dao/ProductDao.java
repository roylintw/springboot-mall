package org.roylin.springbootmall.dao;

import org.roylin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
