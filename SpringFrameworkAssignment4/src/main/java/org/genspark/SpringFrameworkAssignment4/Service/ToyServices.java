package org.genspark.SpringFrameworkAssignment4.Service;

import org.genspark.SpringFrameworkAssignment4.Entity.Toy;

import java.util.List;

public interface ToyServices {

    List<Toy> getAllToys();
    Toy getToyById(int toyId);
    Toy addToy(Toy toy);
    Toy updateToy(Toy toy);
    String deleteToy(int Id);

}
