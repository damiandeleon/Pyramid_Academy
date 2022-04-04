package org.genspark.SpringFrameworkAssignment4.Controller;

import org.genspark.SpringFrameworkAssignment4.Entity.Employee;
import org.genspark.SpringFrameworkAssignment4.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
        private EmployeeService employeeService;

    @GetMapping("/")
        public String home() {
        return "<HTML><H1>HELLO WORLD!</H1></HTML>";
    }

    @GetMapping("/employees")
        public List<Employee> getEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
        public Employee getEmployeeById(@PathVariable String id){
        return this.employeeService.getEmployeeById(Integer.parseInt(id));
    }

    @PostMapping("/employees")
        public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
        public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
        public String deleteEmployeeById(@PathVariable String id){
        return this.employeeService.deleteEmployeeById(Integer.parseInt(id));
    }

}
