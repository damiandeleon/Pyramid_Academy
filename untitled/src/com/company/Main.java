package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Inheritance-
        // tiger extends Animal, so it inherits the behavior of making a sound.
        Tiger tony = new Tiger();
        tony.makeSound("roar");

//        Polymorphism -
//        you can morph the animal class to be specific since a class is a subclass of animal,
//        you can use the Animal class to also create other animals, like a dog
        Animal cat = new Animal();
        cat.age = 3;
        cat.species = "feline";
        System.out.println(cat.age + " " + cat.species);

        Animal dog = new Animal();
        dog.age = 4;
        dog.species = "canine";
        System.out.println(dog.age + " " + dog.species);

        // Encapsulation -------
        // the fields inside the Vehicle class are private, so you can't access them directly like you can in the animal class.
        // You can access them through getters and setters
        Vehicle newCar = new Vehicle();
        newCar.setMake("Chevy");
        newCar.setModel("Malibu");
        System.out.println(newCar.getMake());
        System.out.println(newCar.getModel());

        // Abstraction -------
        // you cannot use an abstract class to call on its function, for example Horn is an abstract class.
        //
        // carHorn will not work.

//        Horn carHorn = new Horn();


        // I can create a child class of Horn (fireTruck), it will inherit the methods inside the Horn class
        TruckHorn fireTruck = new TruckHorn();
        fireTruck.makeSound();

        // Honk has an abstract method called loundHonk, which must be defined when TruckHorn is created.
        fireTruck.loudSound();
    }






}
