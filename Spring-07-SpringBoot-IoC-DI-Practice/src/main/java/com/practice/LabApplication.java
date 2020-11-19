package com.practice;

import com.practice.calculator.Calculator;
import com.practice.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {

		ApplicationContext container = SpringApplication.run(LabApplication.class, args);
		Calculator calculator = container.getBean("calculator",Calculator.class);

		System.out.println(calculator.getTotalCarpetCost(City.ARLINGTON));
	}

}
