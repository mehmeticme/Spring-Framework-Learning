package com.practice.repository;

import com.practice.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employees,Long> {

    // Positional Parameters

    @Query("select e FROM Employees e WHERE  e.email='acurwood6@1und1.de'")
    Employees getEmployeeDetail();


    @Query("select e.salary FROM Employees e WHERE e.email='acurwood6@1und1.de'")
    Integer getEmployeeSalary();


    @Query("select e FROM Employees e WHERE e.email= ?1")
    Optional<Employees> getEmployeeFromEmail(String email);


    @Query("select e FROM Employees e WHERE e.email = ?1 AND e.salary=?2")
    Optional<Employees> getEmployeeByEmailAndSalary(String email, int salary);


    // Named Parameters


    @Query("select e FROM Employees e WHERE e.email= :email")
    Optional<Employees> getEmployeeFromEmailParam(@Param("email") String email);

    @Query("select e FROM Employees e WHERE e.email = :email AND e.salary=:salary")
    Optional<Employees> getEmployeeByEmailAndSalaryParam(@Param("email") String email, @Param("salary") int salary);



    // Not equal
    @Query("select e FROM Employees e WHERE e.salary <> ?1")
    List<Employees> getEmployeesBySalaryNotEqual(int salary);


    // Like // Contains // StartsWith // EndsWith

    @Query("select e FROM Employees e WHERE e.firstName LIKE ?1")
    List<Employees> getEmployeesByFirstNameLike(String pattern);

    @Query("select e FROM Employees e WHERE e.firstName LIKE %?1%")
    List<Employees> getEmployeesByFirstNameContains(String pattern);

    // Less Than
    @Query("select e FROM Employees e WHERE e.salary < ?1")
    List<Employees> getEmployeeBySalaryLessThan(int salary);

    // Greater Than
    @Query("select e FROM Employees e WHERE e.salary > ?1")
    List<Employees> getEmployeeBySalaryGreaterThan(int salary);

    // Between
    @Query("select e FROM Employees e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employees> getEmployeeBySalaryBetween(int salary1, int salary2);

    // Before
    @Query("select e FROM Employees e WHERE e.hireDate > ?1")
    List<Employees> getEmployeeByHireDateBefore(LocalDate date);

    //null
    @Query("select e FROM Employees e WHERE e.email is null ")
    List<Employees> getEmployeeByEmailIsNull();

    // not null
    @Query("select e FROM Employees e WHERE e.email is not null ")
    List<Employees> getEmployeeByEmailIsNotNull();

    // Sort salary in desc order
    @Query("select e from Employees e ORDER BY e.salary desc ")
    List<Employees> getEmployeeBtSalaryOrderByDesc();

    // Sort salary in asc order
    @Query("select e from Employees e ORDER BY e.salary")
    //  @Query("select e from Employees e ORDER BY e.salary asc ")
    List<Employees> getEmployeeBtSalaryOrderByASC();


    // Native Query

    @Query(value = "SELECT * FROM employees where salary = ?",nativeQuery = true)
    List<Employees> readEmployeeBySalary(int salary);
    

    // Modifying

    @Modifying
    @Transactional
    @Query("update Employees e SET e.email='admin@email.com' where e.id=:id")
    void updateEmployeeJPQL(@Param("id") int id);
}
