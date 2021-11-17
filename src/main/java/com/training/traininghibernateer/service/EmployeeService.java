package com.training.traininghibernateer.service;

import java.util.List;

import com.training.traininghibernateer.model.Employee;

public interface EmployeeService {
    void addEmployee(Employee employee);
    void removeEmployee(String employeeId);
    void updateEemployee(Employee employee);
    List<Employee> getEmployee();
}
