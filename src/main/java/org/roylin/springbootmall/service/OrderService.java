package org.roylin.springbootmall.service;

import org.roylin.springbootmall.dto.CreateOrderRequest;
import org.roylin.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
