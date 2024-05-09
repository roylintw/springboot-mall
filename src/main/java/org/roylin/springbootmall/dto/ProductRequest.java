package org.roylin.springbootmall.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.roylin.springbootmall.constant.ProductCategory;

import java.util.Date;

@Data
public class ProductRequest {

    @NotNull
    private String productName;

    @NotNull
    private ProductCategory category;

    @NotNull
    private String imageUrl;

    @NotNull
    private Integer price;

    @NotNull
    private Integer stock;

    private String description;

}
