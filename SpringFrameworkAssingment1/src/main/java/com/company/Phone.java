package com.company;

public class Phone {
    public String mob;

    public Phone(String mob) {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }

//    public void setMob(String mob) {
//        this.mob = mob;
//    }


    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
