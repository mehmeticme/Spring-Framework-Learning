package com.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name="departments")
@Entity
public class Department extends BaseEntity{

    private String department;
    private String division;

    @OneToOne(mappedBy = "department")
    @JoinColumn(name = "department_id")
    private Employees employees;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
