package com.employeesservice.service;

import com.employeesservice.pojo.Employee;

public interface EmployeeService {
	Employee findByEmpId(Long empId);
}
