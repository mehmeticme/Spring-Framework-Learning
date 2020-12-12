package com.practice.entity;

import com.practice.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Transient
    private String city;

    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateAndTime;



    @Column(columnDefinition = "DATE")
    private LocalDate userCreateDate;
    @Column(columnDefinition = "TIME")
    private LocalTime userCreateTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime serCreateDateAndTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;


}
