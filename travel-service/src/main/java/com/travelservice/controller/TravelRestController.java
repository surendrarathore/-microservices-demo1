package com.travelservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelservice.pojo.Travel;
import com.travelservice.service.TravelService;

@RestController
@RequestMapping("travel")
public class TravelRestController {

	@Autowired
	TravelService travelService;

	@GetMapping("gettravelbyid/{empId}")
	public Travel getTravelById(@PathVariable Long empId) {
		return travelService.getTravelById(empId);
	}

}
