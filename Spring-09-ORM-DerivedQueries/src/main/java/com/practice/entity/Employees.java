package com.practice.entity;

import com.practice.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employees {
    @Id
//    @GeneratedValue
    private Long id;
    private String firstName;
    private  String lastName;
    private  String email;

@Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer salary;


    @ManyToOne
    @JoinColumn(name = "department")
    private  Departments department;

    @ManyToOne
    @JoinColumn(name = "regionId")
    private Regions regions;


    @Autowired
    public Employees(Long id, String firstName, String lastName, String email, LocalDate hireDate, Gender gender, Integer salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }
}
