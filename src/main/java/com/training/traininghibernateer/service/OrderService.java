package com.training.traininghibernateer.service;

import java.util.List;

import com.training.traininghibernateer.model.Order;

public interface OrderService {
    void addOrder(Order Order);
    void removeOrder(Order Order);
	void updateOrder(Order Order);
    Order getById(Integer OrderId);
    List<Order> getOrders();

}
