package com.practice.controller;

import com.practice.enums.Gender;
import com.practice.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor("Mike","Smith",Gender.MALE,75));
        mentorList.add(new Mentor("Ammy","Anny",Gender.MALE,42));
        mentorList.add(new Mentor("Elliott","Elliott",Gender.MALE,32));

        model.addAttribute("mentors",mentorList);
        return "/mentor/mentorList";
    }


}
