package com.ty.Izgo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	private long phone;
	private String licenseNo;
	@Column(nullable = false)
	private String role;
}
