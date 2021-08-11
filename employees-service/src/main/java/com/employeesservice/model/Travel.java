package com.employeesservice.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Travel {
	private Long empId;

	private String travelType;

	private BigDecimal travelAmount;
}
