package com.practice;

import com.practice.entity.Car;
import com.practice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OrmconfigApplication {


	CarRepository carRepository;

	@Autowired
	public OrmconfigApplication(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrmconfigApplication.class, args);
	}


	@PostConstruct
	public void dataInit(){
		Car c1 = new Car("BMW","M5");
		Car c2 = new Car("Mercedes","CLA");
		Car c3 = new Car("Toyota","Corolla");

		carRepository.save(c1);
		carRepository.save(c2);
		carRepository.save(c3);
	}

}
