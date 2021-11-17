package com.training.traininghibernateer.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.traininghibernateer.dao.EmployeeDAO;
import com.training.traininghibernateer.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		
	}

	@Override
	public void removeEmployee(String employeeId) {
		sessionFactory.getCurrentSession().remove(sessionFactory.getCurrentSession().byId(Employee.class).getReference(employeeId));		
	}

	@Override
	public void updateEemployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
		
	}

	@Override
	public List<Employee> getEmployee() {
    	return sessionFactory.getCurrentSession().createQuery("from Employee e", Employee.class).list();
	}

}
