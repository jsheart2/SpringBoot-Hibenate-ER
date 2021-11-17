package com.training.traininghibernateer.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.traininghibernateer.model.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Order getById(Integer OrderId) {
        return sessionFactory.getCurrentSession().get(Order.class, OrderId);
    }

    @Override
    public void addOrder(Order Order) {
        sessionFactory.getCurrentSession().save(Order);
    }

    @Override
    public void removeOrder(Order Order) {
        sessionFactory.getCurrentSession().remove(Order);
    }

    @Override
    public void updateOrder(Order Order) {
        sessionFactory.getCurrentSession().update(Order);
    }

    @Override
    public List<Order> getOrders() {
        return sessionFactory.getCurrentSession().createQuery("from Order", Order.class).list();
    }

}
