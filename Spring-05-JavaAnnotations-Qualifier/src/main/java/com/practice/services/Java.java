package com.practice.services;

import com.practice.interfaces.Course;
import com.practice.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {


    private ExtraSessions extraSessions1;
    private ExtraSessions extraSessions2;

    @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions1, @Qualifier("reviewHours") ExtraSessions extraSessions2) {
        this.extraSessions1 = extraSessions1;
        this.extraSessions2 = extraSessions2;
    }


    @Override
    public void getLearningHours() {
        System.out.println("Weekly learning hours: 20 + Office Hours: " + extraSessions1.getHours() + " + Review Hours : "+extraSessions2.getHours());
    }
}
