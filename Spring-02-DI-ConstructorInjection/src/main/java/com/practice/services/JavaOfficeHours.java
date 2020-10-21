package com.practice.services;

import com.practice.interfaces.ExtraSessions;

public class JavaOfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 5;
    }
}
