package com.ty.Izgo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String carName;
	private double ratePerKm;
	private double mileage;
	private String engineType;
	private String availabilityStatus;
	@Column(nullable = false,unique = true )
	private String vehicleNo;
}
