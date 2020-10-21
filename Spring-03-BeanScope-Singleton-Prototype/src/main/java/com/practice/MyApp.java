package com.practice;

import com.practice.interfaces.Course;
import com.practice.services.JavaScript;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = (Course) container.getBean("javaClass");
        Course course2 = (Course) container.getBean("javaClass");

        System.out.println("Are course1 and course2 pointing the same object: " + (course1 == course2));
        System.out.println("Memory location of course1: " + course1.toString());
        System.out.println("Memory location of course1: " + course2.toString() );


        System.out.println("==========================================================");



        Course course3 = (Course) container.getBean("javaScriptClass");
        Course course4 = (Course) container.getBean("javaScriptClass");

        System.out.println("Are course3 and course4 pointing the same object: " + (course3 == course4));
        System.out.println("Memory location of course3: " + course3.toString());
        System.out.println("Memory location of course4: " + course4.toString() );


    }
}
