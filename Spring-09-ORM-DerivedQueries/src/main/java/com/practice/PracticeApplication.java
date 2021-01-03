package com.practice;

import com.practice.entity.Departments;
import com.practice.repository.DepartmentRepository;
import com.practice.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PracticeApplication {

	@Autowired
	RegionRepository regionRepository;
	@Autowired
	DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}


	@PostConstruct
	public void test(){


		System.out.println("======================");
		System.out.println(departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));
		System.out.println("======================");
	}

}
