package com.project.restaurant_management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="diet_table")
public class Diet {
	
	@Id
	@Column(name="diet_id")
	private int diet_id;
	
	@Column(name="diet_type")
	private String diet_type;
	
	@Column(name="diet_descrip")
	private String diet_descrip;

}
