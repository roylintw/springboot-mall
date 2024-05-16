package org.roylin.springbootmall.dto;

import lombok.Data;
import org.roylin.springbootmall.constant.ProductCategory;

// 11-11
@Data
public class ProductQueryParam {

    private ProductCategory category;

    private String search;

    private String orderBy;

    private String sort;

}
