package org.genspark.SpringFrameworkAssignment4.Service;

import org.genspark.SpringFrameworkAssignment4.Entity.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToyServciesImpl implements ToyServices{

    List<Toy> list;

    public ToyServciesImpl() {
        list = new ArrayList<>();
        list.add(new Toy(1,"He-Man","MOTU"));
        list.add(new Toy(2,"Skeletor","MOTU"));
        list.add(new Toy(3,"She-Ra","MOTU"));
        list.add(new Toy(4,"Hordak","MOTU"));
    }

    @Override
    public List<Toy> getAllToys() {
        return list;
    }

    @Override
    public Toy getToyById(int Id) {
        Toy toy = null;

        for(Toy t: list){
            if(t.getToyId() == Id){
                toy = t;
                break;
            }
        }
        return toy;
    }

    @Override
    public Toy addToy(Toy toy) {
        list.add(toy);
        return toy;
    }

    @Override
    public Toy updateToy(Toy toy) {

        for (Toy t: list){
            if(t.getToyId()==toy.getToyId()){
                t.setName(toy.getName());
                t.setToyLine(toy.getToyLine());
                break;
            }
        }
        return toy;
    }

    @Override
    public String deleteToy(int Id) {

        for(Toy t: list){
            if (t.getToyId()==Id){
                list.remove(t);
                break;
            }
        }
        return "Deletion processed successfully!";
    }
}
