package org.roylin.springbootmall.service;

import org.roylin.springbootmall.dto.CreateOrderRequest;
import org.roylin.springbootmall.dto.OrderQueryParams;
import org.roylin.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParam);

    List<Order> getOrders(OrderQueryParams orderQueryParam);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
