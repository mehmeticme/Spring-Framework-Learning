package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST ,value = "/home_v1")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET ,value = "/home_v2")
    public String getRequestMapping3(){
        return "home";
    }


    @GetMapping("/spring")
    public String getRequestMapping4(){
        return "home";
    }

    @PostMapping("/spring")
    public String getRequestMapping5(){
        return "home";
    }

    @GetMapping("/spring/{name}")
    public String getRequestMapping6(@PathVariable("name")String name){
        System.out.println("Paramater name is "+ name);
        return "home";
    }

    @GetMapping("/spring/course")
    public String requestParamEx(@RequestParam("course")String course){
        System.out.println("Course is "+ course);
        return "home";
    }

    @GetMapping(value = "/course")
    public String requestParamEx2(@RequestParam(value = "course",required = false, defaultValue = "SpringMVC")String course){
        System.out.println("Course is "+ course);
        return "home";
    }
}
