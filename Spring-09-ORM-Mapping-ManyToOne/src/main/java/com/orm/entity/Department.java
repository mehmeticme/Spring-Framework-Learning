package com.orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name="departments")
@Entity
public class Department extends BaseEntity{

    private String department;
    private String division;


    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
