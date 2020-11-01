package com.practice.services;

import com.practice.interfaces.Course;
import com.practice.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${topic}")
    String topicName;

    @Autowired
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    ExtraSessions extraSessions;

    @Override
    public int getLearningHours() {
        return 15 + extraSessions.getExtraSessions();
    }
}
