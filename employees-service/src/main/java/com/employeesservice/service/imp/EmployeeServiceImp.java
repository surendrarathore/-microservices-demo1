package com.employeesservice.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeesservice.dao.EmployeeDao;
import com.employeesservice.pojo.Employee;
import com.employeesservice.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	@Override
	public Employee findByEmpId(Long empId) {
		return employeeDao.findByEmpId(empId);
	}

}
