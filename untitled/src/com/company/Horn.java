package com.company;

abstract class Horn {
    String type;

    public void makeSound(){
        System.out.println("Hoooooonk");
    }

    public abstract void loudSound();
}
