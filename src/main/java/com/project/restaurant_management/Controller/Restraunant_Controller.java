package com.project.restaurant_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.restaurant_management.entity.Dish;
import com.project.restaurant_management.service.Restaurant_Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/dish")
public class Restraunant_Controller {
	
	@Autowired
	private Restaurant_Service service;
	
	@CrossOrigin(origins = "http://localhost:3000")
	
	@GetMapping("/alldishes")
	public ResponseEntity<String> getall_dishes(){
		List<Dish> dish=service.getall_dishes();
		return new ResponseEntity<>(dish.toString(),HttpStatus.OK);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/save")
	public ResponseEntity<String> saveDish(@RequestBody Dish dishDetails) {
		Dish dish=service.save_dish(dishDetails);
		return new ResponseEntity<>(dish.toString(),HttpStatus.OK);
	}
	
	@PatchMapping("/patch/{id}")
	public ResponseEntity<String> updateDish(@RequestBody Dish dishDetails,@PathVariable String id) {
		Dish dish=service.updateDish(dishDetails,Integer.valueOf(id));
		return new ResponseEntity<>(dish.toString(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteDish(@RequestBody Dish dishDetails,@PathVariable String id) {
		Dish dish=service.deleteDish(dishDetails,Integer.valueOf(id));
		return new ResponseEntity<>(dish.toString(),HttpStatus.OK);
	}
	
	
}
