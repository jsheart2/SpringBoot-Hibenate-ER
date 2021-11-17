package com.training.traininghibernateer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.traininghibernateer.dao.OrderDAO;
import com.training.traininghibernateer.model.Order;

@Service
@Transactional(readOnly = true)

public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderDAO OrderDAO;

    @Override
    @Transactional(readOnly = false)
    public void addOrder(Order Order) {
        OrderDAO.addOrder(Order);    
    }

    @Override
    @Transactional(readOnly = false)
    public void removeOrder(Order Order) {
        OrderDAO.removeOrder(Order);
    }

    @Override
    @Transactional(readOnly = false)
    public void updateOrder(Order Order) {
        OrderDAO.updateOrder(Order);
    }

    @Override
    public Order getById(Integer OrderId) {
        return OrderDAO.getById(OrderId);
    }

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
