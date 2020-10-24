package com.practice.services;

import com.practice.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 3;
    }
}
