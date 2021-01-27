package com.securityform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("index")
    public String getLoginPage(){
        return "/index";
    }


    @GetMapping(value = {"/login","/"})
    public String getLoginPage2(){
        return "/login";
    }
}
