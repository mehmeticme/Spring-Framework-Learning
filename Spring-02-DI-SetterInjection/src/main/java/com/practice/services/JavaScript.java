package com.practice.services;

import com.practice.interfaces.Course;
import com.practice.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class JavaScript implements Course {

 ExtraSessions extraSessions;


    public void getTeachingHours() {
        System.out.println("Weekly JavaScript Teaching Hours: 30 + "+extraSessions.getHours());
    }
}
