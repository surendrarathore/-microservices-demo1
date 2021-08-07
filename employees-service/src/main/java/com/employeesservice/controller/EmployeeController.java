package com.employeesservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeesservice.pojo.Employee;
import com.employeesservice.service.EmployeeService;

@RequestMapping("employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("employeebyid/{empId}")
	public Employee getEmployeeById(@PathVariable Long empId) {
		return employeeService.findByEmpId(empId);
	}

}
