package com.orm.bootstrap;

import com.orm.entity.Department;
import com.orm.entity.Employees;
import com.orm.entity.Region;
import com.orm.enums.Gender;
import com.orm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;

    @Autowired
    public DataGenerator(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employees> employeesList = new ArrayList<>();


        Employees e1 = new Employees("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20), Gender.F,154864);
        Employees e2 = new Employees("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26), Gender.F,56752);
        Employees e3 = new Employees("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17), Gender.F,95313);
        Employees e4 = new Employees("Avrom", "Rowantree", null, LocalDate.of(2014,03,02), Gender.M,119764);
        Employees e5 = new Employees("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), Gender.M,55307);

        Department d1 = new Department("Sports","Outdoors");
        Department d2 = new Department("Tools","Hardware");
        Department d3 = new Department("Clothing","Home");
        Department d4 = new Department("Phones & Tablets","Electronics");
        Department d5 = new Department("Computers","Electronics");

        Region r1 = new Region("Southwest","United States");
        Region r2 = new Region("Central","United States");
        Region r3 = new Region("Northwest","United States");
        Region r4 = new Region("Quebec'","Canada");
        Region r5 = new Region("Central","Asia");

        e1.setDepartment(d1);
        e2.setDepartment(d1);
        e3.setDepartment(d3);
        e4.setDepartment(d4);
        e5.setDepartment(d4);

        e1.setRegion(r1);
        e2.setRegion(r2);
        e3.setRegion(r3);
        e4.setRegion(r4);
        e5.setRegion(r5);


        employeesList.addAll(Arrays.asList(e1,e2,e3,e4,e5));



        employeeRepository.saveAll(employeesList);
        employeeRepository.deleteById(1);


    }
}
