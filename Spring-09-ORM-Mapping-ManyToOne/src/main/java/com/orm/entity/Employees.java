package com.orm.entity;


import com.orm.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="employees")
public class Employees extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int salary;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST})
    @JoinColumn(name = "department_id")
    private Department department;
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST})
    @JoinColumn(name = "region_id")
    private Region region;

    public Employees(String firstName, String lastName, String email, LocalDate hireDate, Gender gender, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }
}
