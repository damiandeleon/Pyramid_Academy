package com.company;

import java.util.List;

public class Student {

    public int id;
    public String name;
    public List<Phone> ph;
    public Address add;

    public void listMe(){
        System.out.println("This is my information \n"+
        id + "\n" +
                id+"\n" +
                name+"\n"+
                ph+"\n"+
                add+"\n");
    }
}
