package com.practice.services;

import com.practice.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class LabHours implements ExtraSessions {
    @Override
    public int getExtraSessions() {
        return 5;
    }
}
