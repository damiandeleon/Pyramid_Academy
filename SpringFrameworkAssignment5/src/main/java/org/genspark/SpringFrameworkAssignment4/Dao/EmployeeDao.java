package org.genspark.SpringFrameworkAssignment4.Dao;

import org.genspark.SpringFrameworkAssignment4.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
