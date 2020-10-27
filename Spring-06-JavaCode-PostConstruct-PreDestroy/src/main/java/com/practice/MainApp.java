package com.practice;

import com.practice.config.MyAppConfig;
import com.practice.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(MyAppConfig.class);

        Course course = (Course) container.getBean("java");

        course.getLearningHours();

        ((AnnotationConfigApplicationContext)container).close();

    }
}
