package com.practice;

import com.practice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PracticeApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}



	@PostConstruct
	public void test(){


		System.out.println("======================");
		System.out.println(employeeRepository.getEmployeeFromEmail("acurwood6@1und1.de"));
		System.out.println("======================");
	}
}
