package com.security3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/management")
public class ManagerController {


        @GetMapping("/index")
        public String index(){
            return "management/index";
        }


}
