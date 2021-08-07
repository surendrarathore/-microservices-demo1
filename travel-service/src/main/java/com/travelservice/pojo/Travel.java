package com.travelservice.pojo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Travel")
@Table(name = "travel")
public class Travel {
	@Id
	@Column(name = "emp_id")
	private Long empId;

	@Column(name = "travel_type")
	private String travelType;

	@Column(name = "travel_amount")
	private BigDecimal travelAmount;
}
