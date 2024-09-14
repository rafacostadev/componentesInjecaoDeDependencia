package com.cursojava.aulas.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.aulas.entities.Order;

@Service
public class OrderCalculationService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	OrderService orderService;
	@Autowired
	ShippingService shippingService;

	public double finalOrderValue(Order order) {
		double valueWithDiscount = orderService.discountValue(order.getBasic(), order.getDiscount());
		return valueWithDiscount + shippingService.shippingValue(valueWithDiscount);
	}

}
