package com.practice.services;

import com.practice.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getLearningHours() {
        System.out.println("Learning 10 hours a week");
    }
}
