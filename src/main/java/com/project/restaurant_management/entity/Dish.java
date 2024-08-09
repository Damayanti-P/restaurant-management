package com.project.restaurant_management.entity;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="dish_table")
public class Dish {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dish_id")
	private int dish_id;
	
	@Column(name="dish_name")
	private String dish_name;
	
	@Column(name="dish_descrip")
	private String dish_descrip;
	
	@Column(name="dish_price")
	private int dish_price;
	
	@Column(name="diet")
	private String diet;
	
}
