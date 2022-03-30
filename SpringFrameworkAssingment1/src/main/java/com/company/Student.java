package com.company;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.stream.Collectors;

public class Student {

    public int id;
    public String name;
    public List<Phone> ph;
    public Address add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

//    public Student(int id, String name, List<Phone> ph, Address add) {
//        this.id = id;
//        this.name = name;
//        this.ph = ph;
//        this.add = add;
//    }

    public Student() {
    }

    public void listMe(){
        System.out.println("This is my information \n"+
                "id:  " + id+"\n" +
                "name:  " + name+"\n"+
                "ph:  " + ph+"\n"+
                "address:  " + add+"\n");
    }
}
