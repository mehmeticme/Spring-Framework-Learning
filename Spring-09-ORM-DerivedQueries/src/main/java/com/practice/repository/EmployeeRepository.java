package com.practice.repository;

import com.practice.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employees,Long> {


    // Diplay all employees with email address ''
    List<Employees> findByEmail(String email);

    // Display All employees with first Name '' and last name '', also show all employees with a email address ''
    List<Employees> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);


    // Display all employees that first name is not ''
    List<Employees> findByFirstNameIsNot(String firstName);

    // Display all employees where last name starts with ''
    List<Employees> findByLastNameStartsWith(String pattern);

    // Display all employees with salaries higher than ''
    List<Employees> findBySalaryGreaterThan(Integer salary);

    // Display all employees with salaries less than equal ''
    List<Employees> findBySalaryLessThanEqual(Integer salary);

    // Display all employees that has been hired between '' and ''
    List<Employees> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    // Display all employees where salaries greater and equal to '' in order
    List<Employees> findBySalaryGreaterThanEqualAndOrderBySalaryDesc(Integer salary);

    // Display top unique 3 employees that is making less than ''
    List<Employees> findDistinctTop3BySalaryLessThan(Integer salary);

    // Display all employees that do not have email address
    List<Employees> findByEmailIsNull();


}
