package org.genspark.SpringFrameworkAssignment4.Service;

import org.genspark.SpringFrameworkAssignment4.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> list;

    public EmployeeServiceImpl() {
        list = new ArrayList<>();
            list.add(new Employee(100, "Amanda", "amanda@email.com"));
            list.add(new Employee(101, "Benjamin", "ben@email.com"));
            list.add(new Employee(102, "Candice", "candice@email.com"));

    }

    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        Employee emp = null;

        for(Employee e: list){
            if(e.getId() == employeeId){
                emp = e;
                break;
            }
        }
        return emp;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        String name = employee.getName();
        String email = employee.getEmail();
        Employee emp = null;

        for(Employee e: list){
            if(e.getId() == employee.getId()){
                e.setName(name);
                e.setEmail(email);
                emp = e;
                break;
            }
        }
        return employee;
    }

    @Override
    public String deleteEmployeeById(int employeeId) {

        for(Employee e: list){
            if(e.getId() == employeeId){
                list.remove(e);
                break;
            }
        }
        return "Delete Processed Successfully";
    }
}
