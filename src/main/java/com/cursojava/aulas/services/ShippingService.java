package com.cursojava.aulas.services;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class ShippingService implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShippingService() {

	}

	public double shippingValue(double value) {
		if (value > 200) {
			return 0;
		} else if (value > 100) {
			return 12.00;
		} else {
			return 20.00;
		}
	}
}
