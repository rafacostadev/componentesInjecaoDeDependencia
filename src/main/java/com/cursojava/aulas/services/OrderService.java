package com.cursojava.aulas.services;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class OrderService implements Serializable {
	private static final long serialVersionUID = 1L;

	public OrderService() {

	}

	public double discountValue(double basic, double discount) {
		return basic - (basic * discount / 100);
	}
}
