package com.employeesservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employeesservice.model.Project;

@FeignClient("project-service")
public interface ProjectFeignClient {

	@GetMapping("project/getprojectbyid/{empId}")
	public Project getProjectById(@PathVariable Long empId);
}
