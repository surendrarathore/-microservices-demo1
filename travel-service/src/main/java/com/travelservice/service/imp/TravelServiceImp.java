package com.travelservice.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travelservice.dao.TravelDao;
import com.travelservice.pojo.Travel;
import com.travelservice.service.TravelService;

@Service
public class TravelServiceImp implements TravelService {

	@Autowired
	private TravelDao travelDao;

	@Transactional
	@Override
	public Travel getTravelById(Long empId) {
		// TODO Auto-generated method stub
		System.out.println(empId);
		return travelDao.findTravelByEmpId(empId);
	}

}
