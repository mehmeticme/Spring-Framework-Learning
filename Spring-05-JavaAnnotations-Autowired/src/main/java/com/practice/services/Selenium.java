package com.practice.services;

import com.practice.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public void getLearningHours() {
        System.out.println("Weekly learning hours: 30");
    }
}
