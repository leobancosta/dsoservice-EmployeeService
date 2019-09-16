package com.dxc.dtc.dso.emp.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dtc.dso.emp.service.EmployeeService;
import com.dxc.dtc.dso.emp.web.dto.EmployeeDTO;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<Void> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		employeeService.createEmployee(employeeDTO);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@GetMapping("/{empEmail}")
	public ResponseEntity<EmployeeDTO> getEmployeeByEmail(@PathVariable("empEmail") String empEmail) {
		EmployeeDTO employeeDTO = employeeService.getEmployeeByEmail(empEmail);
		
		return new ResponseEntity<EmployeeDTO>(employeeDTO, HttpStatus.OK);
	}
}
