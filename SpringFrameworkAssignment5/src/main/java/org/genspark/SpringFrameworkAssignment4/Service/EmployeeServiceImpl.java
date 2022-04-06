package org.genspark.SpringFrameworkAssignment4.Service;

import org.genspark.SpringFrameworkAssignment4.Dao.EmployeeDao;
import org.genspark.SpringFrameworkAssignment4.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        Optional<Employee> emp = this.employeeDao.findById(employeeId);
        Employee employee = null;
        if(emp.isPresent()){
         employee = emp.get();
        } else {
            throw new RuntimeException(" Empmloyee not found for id :: " + employeeId);
        }
    return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
       return this.employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public String deleteEmployeeById(int employeeId) {
        this.employeeDao.deleteById(employeeId);
        return "Delete Processed Successfully";
    }
}
