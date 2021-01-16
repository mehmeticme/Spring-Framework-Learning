package com.practice.repository;

import com.practice.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Departments,String> {


    @Query("select d from Departments d WHERE d.division in ?1")
    List<Departments> getDepartmentsByDivisionIn(List<String> division);


    @Query(nativeQuery = true)
    List<Departments> retrieveDepartmentByDivisionContains(String pattern);


    List<Departments> retrieveDepartmentByDivision(String division);
}
