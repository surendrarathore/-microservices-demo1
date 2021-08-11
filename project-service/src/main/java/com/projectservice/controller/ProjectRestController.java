package com.projectservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectservice.pojo.Project;
import com.projectservice.service.ProjectService;

@RestController
@RequestMapping("project")
public class ProjectRestController {

	@Autowired
	ProjectService travelService;

	@GetMapping("getprojectbyid/{empId}")
	public Project getProjectById(@PathVariable Long empId) {
		return travelService.getProjectById(empId);
	}

}
