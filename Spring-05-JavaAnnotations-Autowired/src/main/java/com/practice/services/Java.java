package com.practice.services;

import com.practice.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    // Field Injection
//    @Autowired
    private OfficeHours officeHours;


    // ==================================================================
    // If there is only one constructor, you dont have to put @Autowired, Spring will handle it
    // Constructor Injection

    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }


    //===================================================================



    /*
    //===================================================================

     // Constructor Injection


    public OfficeHours getOfficeHours() {
        return extraSessions;
    }

    @Autowired
    public void setOfficeHours(OfficeHours extraSessions) {
        this.extraSessions = extraSessions;
    }


    //===================================================================
     */

    @Override
    public void getLearningHours() {
        System.out.println("Weekly learning hours: 20 +" + officeHours.getHours());
    }
}
