package com.practice.services;

import com.practice.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class ReviewHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 9;
    }
}
