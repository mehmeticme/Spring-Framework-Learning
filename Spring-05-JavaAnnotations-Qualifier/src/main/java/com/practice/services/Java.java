package com.practice.services;

import com.practice.interfaces.Course;
import com.practice.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    /*
      --- FIELD INJECTION ---
    //@Autowired
    //@Qualifier("officeHours")

     */
    private ExtraSessions extraSessions;

    @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getLearningHours() {
        System.out.println("Weekly learning hours: 20 +" + extraSessions.getHours());
    }
}
