package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        public static void main(String[] args) {

            ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
            Student student = (Student) context.getBean("Student");
            student.listMe();

        }
    }
