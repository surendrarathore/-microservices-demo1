package com.employeesservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employeesservice.model.Travel;

@FeignClient("travel-service")
public interface TravelFeignClient {

	@GetMapping("travel/gettravelbyid/{empId}")
	public Travel getTravelById(@PathVariable Long empId);
}
