package org.roylin.springbootmall.dto;

import lombok.Data;

// 11-28
@Data
public class OrderQueryParams {

    private Integer userId;

    private Integer limit;

    private Integer offset;

}
