package com.practice.services;

import com.practice.interfaces.Course;
import com.practice.interfaces.ExtraSessions;

public class Java implements Course {
    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Java Teaching Hours: 20 + Office Hours("+extraSessions.getHours()+")");
    }
}
