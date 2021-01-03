package com.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Departments {

    @Id
    private String department;
    private String division;


    @Autowired
    public Departments(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
