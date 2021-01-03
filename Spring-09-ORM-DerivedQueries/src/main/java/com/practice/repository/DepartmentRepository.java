package com.practice.repository;

import com.practice.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Departments,String> {

    // Display all departments in the Furniture Department

    List<Departments> findByDepartment(String department);

    // Display all departments in the Health Division

    List<Departments> findByDivision(String divisionName);

    // Display all departments in the Heath Division

    List<Departments> findByDivisionIs(String divisionName);


    // Display all departments in the Heath Division

    List<Departments> findByDivisionEquals(String divisionName);



    // Display all departments with division name ends with 'ics'
    List<Departments> findByDivisionEndingWith(String endsWith);



    List<Departments> findDistinctTop3ByDivisionContaining(String contains);



}
