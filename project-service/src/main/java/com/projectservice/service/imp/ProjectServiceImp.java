package com.projectservice.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectservice.dao.ProjectDao;
import com.projectservice.pojo.Project;
import com.projectservice.service.ProjectService;
@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectDao projectDao;

	@Transactional
	@Override
	public Project getProjectById(Long empId) {
		// TODO Auto-generated method stub
		return projectDao.findProjectByEmpId(empId);
	}

}
