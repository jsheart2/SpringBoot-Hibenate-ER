package com.training.traininghibernateer.dao;

import java.util.List;

import com.training.traininghibernateer.model.Employee;

public interface EmployeeDAO {
    void addEmployee(Employee employee);
    void removeEmployee(String employeeId);
    void updateEemployee(Employee employee);
    List<Employee> getEmployee();
}
