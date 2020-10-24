package com.practice.services;

import com.practice.interfaces.Course;
import com.practice.interfaces.ExtraSessions;

public class Java implements Course {

    private ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getLearningHours() {
        System.out.println(" Learning 20 hours a week + Office Hours: "+extraSessions.getHours());
    }
}
