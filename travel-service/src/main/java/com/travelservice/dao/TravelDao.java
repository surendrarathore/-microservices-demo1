package com.travelservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelservice.pojo.Travel;

@Repository
public interface TravelDao extends JpaRepository<Travel, Long> {
	Travel findTravelByEmpId(Long empId);
}
