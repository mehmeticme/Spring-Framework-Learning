package com.practice.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.practice")
@PropertySource("classpath:application.properties")
public class MyAppConfig {

}
