package com.cursojava.aulas.entities;

import java.io.Serializable;
import java.util.Objects;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	private int code;
	private double basic;
	private double discount;

	public Order() {

	}

	public Order(int code, double basic, double discount) {
		super();
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return code == other.code;
	}

	@Override
	public String toString() {
		return "Order [code=" + code + ", basic=" + basic + ", discount=" + discount + "]";
	}

}
