package com.practice.configs;

import com.practice.interfaces.ExtraSessions;
import com.practice.services.Java;
import com.practice.services.OfficeHours;
import com.practice.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.practice")
public class MyAppConfig {

    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }


    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }
}
