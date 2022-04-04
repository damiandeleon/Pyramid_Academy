package org.genspark.SpringFrameworkAssignment4.Service;

import org.genspark.SpringFrameworkAssignment4.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int employeeId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(int employeeId);
}
