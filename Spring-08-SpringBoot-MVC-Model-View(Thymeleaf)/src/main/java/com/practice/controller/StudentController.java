package com.practice.controller;

import com.practice.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        String subject = "MVC - Model";

        model.addAttribute("pageName","Student Page");
        model.addAttribute("subject",subject);


        int studentId = new Random().nextInt(100);
        model.addAttribute("id",studentId);


        LocalDate birthday = LocalDate.now().minusYears(50);
        model.addAttribute("birthday",birthday);


        Student student = new Student(1,"Mehmet","Icme");
        model.addAttribute("student",student);



        return "student/welcomePage";
    }


    @GetMapping("/register")
    public String register(Model model){

        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("TypeScript");
        courses.add("JavaScript");
        courses.add("SpringBoot");
        courses.add("Angular");
        courses.add("Spring MVC");
        courses.add("Thymeleaf");

        model.addAttribute("courses",courses);

        return "student/register";
    }

}
