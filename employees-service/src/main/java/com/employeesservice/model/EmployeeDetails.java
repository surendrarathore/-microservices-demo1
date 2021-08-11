package com.employeesservice.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDetails {

	private Long empId;

	private String empName;

	private String empGender;

	private String travelType;

	private BigDecimal travelAmount;

	private String projectName;

	private String projectTech;

}
