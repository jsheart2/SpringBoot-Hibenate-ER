package com.training.traininghibernateer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.traininghibernateer.model.Order;
import com.training.traininghibernateer.model.OrderItem;
import com.training.traininghibernateer.service.OrderService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/order_user")
public class OrderController {
	
	@Autowired
	private OrderService OrderService;
	
	@GetMapping(path = "/", produces = "application/json")
    public List<Order> getAllOrder() {
        return OrderService.getOrders();
    }
	
    @GetMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public Order getById(@PathVariable("id") Integer id) {
        return OrderService.getById(id);
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public Order addOrder(@RequestBody Order Order) {
        BigDecimal totalOrder = BigDecimal.ZERO;
        for (OrderItem item : Order.getOrderItems()) {
            item.setOrder(Order);
            totalOrder = totalOrder.add(item.getUnitPrice().multiply(new BigDecimal(item.getOrderQty())));
        }
        Order.setTotalOrder(totalOrder);
        OrderService.addOrder(Order);

        return Order;
    }

    @PutMapping(path = "/", consumes = "application/json", produces = "application/json")
    public void updateOrder(@RequestBody Order Order) {
    	OrderService.updateOrder(Order);
    }

    @DeleteMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public void deleteOrder(@PathVariable("id") Integer id) {
        Order Order = OrderService.getById(id);
        OrderService.removeOrder(Order);
    }
	
}
