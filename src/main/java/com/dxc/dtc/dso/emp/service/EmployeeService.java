package com.dxc.dtc.dso.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dtc.dso.emp.dao.EmployeeDAO;
import com.dxc.dtc.dso.emp.model.Employee;
import com.dxc.dtc.dso.emp.web.dto.EmployeeDTO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void createEmployee(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		employee.setEmpEmail(employeeDTO.getEmpEmail());
		employee.setEmpPassword(employeeDTO.getEmpPassword());
		employee.setEmpFirstname(employeeDTO.getEmpFirstname());
		employee.setEmpLastname(employeeDTO.getEmpLastname());
		employeeDAO.createEmployee(employee);
	}
	
	public EmployeeDTO getEmployeeByEmail(String employeeEmail) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		Employee employee = employeeDAO.getEmployeeByEmail(employeeEmail);
		employeeDTO.setEmpEmail(employee.getEmpEmail());
		employeeDTO.setEmpPassword(employee.getEmpPassword());
		employeeDTO.setActive(true);
		return employeeDTO;
	}
}
