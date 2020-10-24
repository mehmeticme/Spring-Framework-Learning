package com.practice;

import com.practice.configs.MyAppConfig;
import com.practice.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(MyAppConfig.class);

        Course course = (Course) container.getBean("java");
        System.out.println(course.toString());
    }
}
