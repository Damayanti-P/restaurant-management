package com.project.restaurant_management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="user_email")
	private String user_email;
	
	@Column(name="user_password")
	private int user_password;
	
	@Column(name="user_phone_number")
	private String user_phone_number;
	
	
}
