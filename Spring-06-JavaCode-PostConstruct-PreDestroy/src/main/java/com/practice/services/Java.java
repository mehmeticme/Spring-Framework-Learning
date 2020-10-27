package com.practice.services;

import com.practice.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {
    public void getLearningHours() {
        System.out.println("Learning 20 hours a week");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct...");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy !!!");
    }
}
