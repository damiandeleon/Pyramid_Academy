package org.genspark.SpringFrameworkAssignment4.Service;

import org.genspark.SpringFrameworkAssignment4.Dao.ToyDao;
import org.genspark.SpringFrameworkAssignment4.Entity.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToyServciesImpl implements ToyServices{

    @Autowired
   ToyDao toyDao;

    @Override
    public List<Toy> getAllToys() {
        return toyDao.findAll();
    }

    @Override
    public Toy getToyById(int Id) {
        Optional<Toy> toy = toyDao.findById(Id);
        Toy t = new Toy();

        if(toy.isPresent()){
            t=toy.get();
        }
        return t;
    }

    @Override
    public Toy addToy(Toy toy) {
        return toyDao.save(toy);
    }

    @Override
    public Toy updateToy(Toy toy) {
        return toyDao.save(toy);
    }

    @Override
    public String deleteToy(int Id) {
    toyDao.deleteById(Id);
        return "Deletion processed successfully!";
    }
}
