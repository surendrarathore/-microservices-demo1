package com.employeesservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeesservice.pojo.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	Employee findByEmpId(Long empId);
}
