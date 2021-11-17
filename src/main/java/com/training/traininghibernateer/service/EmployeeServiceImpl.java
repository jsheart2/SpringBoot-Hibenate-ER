package com.training.traininghibernateer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.traininghibernateer.dao.EmployeeDAO;
import com.training.traininghibernateer.model.Employee;
import com.training.traininghibernateer.service.EmployeeService;

@Service
@Transactional(readOnly = true)

public class EmployeeServiceImpl implements EmployeeService {

	    @Autowired
	    private  EmployeeDAO employeeDAO;

	    @Override
	    @Transactional(readOnly = false)
	    public void addEmployee(Employee employee) {
	        employeeDAO.addEmployee(employee);
	    }

	    @Override
	    @Transactional(readOnly = false)
	    public void removeEmployee(String employeeId) {
	        employeeDAO.removeEmployee(employeeId);
	    }

	    @Override
	    @Transactional(readOnly = false)
	    public void updateEemployee(Employee employee) {
	        employeeDAO.updateEemployee(employee);
	    }

	    @Override
	    public List<Employee> getEmployee() {
	        return employeeDAO.getEmployee();
	    }
}
