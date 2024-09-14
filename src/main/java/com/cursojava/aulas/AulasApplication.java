package com.cursojava.aulas;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursojava.aulas.entities.Order;
import com.cursojava.aulas.services.OrderCalculationService;

@SpringBootApplication
public class AulasApplication implements CommandLineRunner {

	@Autowired
	private OrderCalculationService orderCalculationService;

	public static void main(String[] args) {
		SpringApplication.run(AulasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Informe o código do pedido, valor básico e porcentagem de desconto:");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();
		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderCalculationService.finalOrderValue(order)));
		sc.close();
	}

}
