package com.practice.controller;

import com.practice.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String getEmployeeFormPage(Model model){

        model.addAttribute("employee",new Employee());



        return "/employee/employeeRegister";
    }


    @PostMapping("/employeeList")
    public String submitEmployee(@ModelAttribute("employee")Employee employee, Model model){



        return "/employee/employeeListPage";
    }

}
