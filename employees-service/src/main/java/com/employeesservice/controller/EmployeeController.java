package com.employeesservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeesservice.model.EmployeeDetails;
import com.employeesservice.model.Project;
import com.employeesservice.model.Travel;
import com.employeesservice.pojo.Employee;
import com.employeesservice.service.EmployeeService;
import com.employeesservice.service.ProjectFeignClient;
import com.employeesservice.service.TravelFeignClient;

@RequestMapping("employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private TravelFeignClient travelFeignClient;

	@Autowired
	private ProjectFeignClient projectFeignClient;

	@GetMapping("employeebyid/{empId}")
	public Employee getEmployeeById(@PathVariable Long empId) {
		return employeeService.findByEmpId(empId);
	}

	@GetMapping("employeedetailsbyid/{empId}")
	public EmployeeDetails getEmployeeDetailsById(@PathVariable Long empId) {
		EmployeeDetails details = new EmployeeDetails();
		Employee emp = employeeService.findByEmpId(empId);
		Travel travel = travelFeignClient.getTravelById(empId);
		Project project = projectFeignClient.getProjectById(empId);
		details.setEmpId(emp.getEmpId());
		details.setEmpName(emp.getEmpName());
		details.setEmpGender(emp.getEmpGender());
		details.setTravelType(travel.getTravelType());
		details.setTravelAmount(travel.getTravelAmount());
		details.setProjectName(project.getProjectName());
		details.setProjectTech(project.getProjectTech());
		return details;
	}

}
