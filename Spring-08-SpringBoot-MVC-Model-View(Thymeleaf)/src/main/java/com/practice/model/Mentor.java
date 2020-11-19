package com.practice.model;

import com.practice.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {

    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;

}
