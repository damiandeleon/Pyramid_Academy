package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    public int id = 12344;
    public String name = "Damian";
    StudentInfo info;

}
