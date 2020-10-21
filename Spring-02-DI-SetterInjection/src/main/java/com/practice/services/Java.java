package com.practice.services;

import com.practice.interfaces.Course;
import com.practice.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    private ExtraSessions extraSessions;

    public void getTeachingHours() {
        System.out.println("Weekly Java Teaching Hours: 20 + Office Hours("+extraSessions.getHours()+")");
    }
}
