package com.projectservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectservice.pojo.Project;
@Repository
public interface ProjectDao extends JpaRepository<Project, Long> {
	Project findProjectByEmpId(Long empId);
}
