package com.training.traininghibernateer.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.training.traininghibernateer.model.Order;
import com.training.traininghibernateer.model.Product;

@Entity
@Table(name = "order_item")
public class OrderItem {
	
	private Integer OrderItemId;
    private Float OrderQty;
    private BigDecimal UnitPrice;
    private Order Order;
    private Product Product;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id", unique = true, nullable = false)
    public Integer getOrderItemId() {
        return OrderItemId;
    }
    
    public void setOrderItemId(Integer orderItemId) {
		OrderItemId = orderItemId;
	}
    
    @Column(name = "order_qty")
    public Float getOrderQty() {
        return OrderQty;
    }
    
    public void setOrderQty(Float orderQty) {
        this.OrderQty = orderQty;
    }
    
    @Column(name = "unit_price")
    public BigDecimal getUnitPrice() {
        return UnitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.UnitPrice = unitPrice;
    }
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore
    public Order getOrder() {
        return Order;
    }
    
    public void setOrder(Order Order) {
        this.Order = Order;
    }
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_code")
    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product product) {
        this.Product = product;
    }
}
