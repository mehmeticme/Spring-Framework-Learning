package com.practice.services;

import com.practice.interfaces.Course;
import com.practice.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    // Field Injection
//    @Autowired
    private ExtraSessions extraSessions;


    // ==================================================================
    // If there is only one constructor, you dont have to put @Autowired, Spring will handle it
    // Constructor Injection

    @Autowired
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    //===================================================================



    /*
    //===================================================================

     // Constructor Injection


    public ExtraSessions getExtraSessions() {
        return extraSessions;
    }

    @Autowired
    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    //===================================================================
     */

    @Override
    public void getLearningHours() {
        System.out.println("Weekly learning hours: 20 +" + extraSessions.getHours());
    }
}
