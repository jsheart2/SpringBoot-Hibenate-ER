package com.training.traininghibernateer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.training.traininghibernateer.model.Employee;
import com.training.traininghibernateer.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/data")
public class EmployeeController {
	
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/", produces = "application/json")
    public List<Employee> getAllEmployee() {
        return employeeService.getEmployee();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping(path = "/", consumes = "application/json", produces = "application/json")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEemployee(employee);
    }

    @DeleteMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public void deleteEmployee(@PathVariable("id") String id) {
        employeeService.removeEmployee(id);
    }

}
