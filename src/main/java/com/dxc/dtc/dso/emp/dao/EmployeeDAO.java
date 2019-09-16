package com.dxc.dtc.dso.emp.dao;

import com.dxc.dtc.dso.emp.model.Employee;

public interface EmployeeDAO {

	void createEmployee(Employee employee);
	
	Employee getEmployeeByEmail(String employeeEmail);

}
