package com.training.traininghibernateer.dao;

import java.util.List;

import com.training.traininghibernateer.model.Order;

public interface OrderDAO {
	Order getById(Integer OrderId);
    void addOrder(Order Order);
    void removeOrder(Order Order);
    void updateOrder(Order Order);
    List<Order> getOrders();
}
