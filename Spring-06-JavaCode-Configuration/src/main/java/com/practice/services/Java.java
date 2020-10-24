package com.practice.services;

import com.practice.interfaces.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

    @Value("${student}")
    private String studentName;

    @Value("${days}")
    private String[] days;

    @Value("String Value")
    private String testString;

    @Override
    public String toString() {
        return "Java{" +
                "studentName='" + studentName + '\'' +
                ", days=" + Arrays.toString(days) +
                ", testString='" + testString + '\'' +
                '}';
    }

    @Override
    public void getLearningHours() {
        System.out.println(" Learning 20 hours a week");
    }
}
