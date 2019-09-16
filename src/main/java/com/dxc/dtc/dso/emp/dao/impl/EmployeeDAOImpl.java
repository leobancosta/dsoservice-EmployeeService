package com.dxc.dtc.dso.emp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.dxc.dtc.dso.emp.dao.EmployeeDAO;
import com.dxc.dtc.dso.emp.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO	{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void createEmployee(Employee employee) {
		entityManager.persist(employee);
		entityManager.flush();
	}
	
	public Employee getEmployeeByEmail(String employeeEmail) {
		Employee employee = null;

		Query query = entityManager.createQuery("Select e FROM employee e WHERE e.empEmail = :empEmail");
		query.setParameter("empEmail", employeeEmail);
		
		List<Employee> results = (List<Employee>)query.getResultList();
		
		if(!results.isEmpty()){
			employee = (Employee)results.get(0);
		}
		return employee;
	}
}
