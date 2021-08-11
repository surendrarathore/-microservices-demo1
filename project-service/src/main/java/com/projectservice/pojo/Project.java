package com.projectservice.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Project")
@Table(name = "project")
public class Project {
	@Id
	@Column(name = "emp_id")
	private Long empId;

	@Column(name = "project_name")
	private String projectName;

	@Column(name = "project_tech")
	private String projectTech;
}