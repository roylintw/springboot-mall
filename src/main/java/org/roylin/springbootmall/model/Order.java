package org.roylin.springbootmall.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {

    private Integer orderId;

    private Integer userId;

    private Integer totalAmount;

    private Date createdDate;

    private Date lastModifiedDate;

    // 11-26
    private List<OrderItem> orderItemList;

}
