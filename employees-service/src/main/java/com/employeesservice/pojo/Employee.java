package com.employeesservice.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Employee")
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private Long empId;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_gender")
	private String empGender;

}
