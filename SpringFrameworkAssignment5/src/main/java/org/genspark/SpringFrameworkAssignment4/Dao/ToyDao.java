package org.genspark.SpringFrameworkAssignment4.Dao;

import org.genspark.SpringFrameworkAssignment4.Entity.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyDao extends JpaRepository<Toy, Integer> {
}
