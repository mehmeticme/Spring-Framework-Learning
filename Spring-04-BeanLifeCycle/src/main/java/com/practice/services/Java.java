package com.practice.services;

import com.practice.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours is 10");
    }

    public void myInitMethod(){
        System.out.println("Executing init method");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroy method");

    }
}
