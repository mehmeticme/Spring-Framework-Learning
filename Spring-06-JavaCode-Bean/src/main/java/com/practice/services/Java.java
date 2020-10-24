package com.practice.services;

import com.practice.interfaces.Course;

public class Java implements Course {
    @Override
    public void getLearningHours() {
        System.out.println(" Learning 20 hours a week");
    }
}
