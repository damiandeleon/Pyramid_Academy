package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguation {

    @Bean
    public Student getStudent()
    {
        return new Student();
    }
}
