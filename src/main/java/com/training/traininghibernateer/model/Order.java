package com.training.traininghibernateer.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.training.traininghibernateer.model.OrderItem;

@Entity
@Table(name = "order")

public class Order {
	private Integer OrderId;
    private String customerName;
    private Date orderDate;
    private BigDecimal totalOrder;
    private List<OrderItem> OrderItems;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_id", unique = true, nullable = false)//, insertable = false, updatable = false)
    public Integer getOrderId() {
        return OrderId;
    }
    
    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }
    
    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Column(name = "Order_date")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    @Column(name = "total_order")
    public BigDecimal getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(BigDecimal totalOrder) {
        this.totalOrder = totalOrder;
    }
	
    @OneToMany(mappedBy = "order", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<OrderItem> getOrderItems() {
        return OrderItems;
    }
    
    public void setOrderItems(List<OrderItem> OrderItems) {
        this.OrderItems = OrderItems;
    }

}
