package com.project.restaurant_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.restaurant_management.entity.Dish;
import com.project.restaurant_management.repo.Restaurant_Repo;

@Service
public class Restaurant_Service {
	
	@Autowired
	private Restaurant_Repo repo;

	public	List<Dish> getall_dishes() {
		List<Dish> dish=repo.getall_dishes();
		return dish;
	}

	public Dish save_dish(Dish dishDetails) {
		
		Dish dish=repo.save(dishDetails);
		return dish;
	}

	public Dish updateDish(Dish dishDetails, int id) {
		Dish dish=repo.findById(id).get();
		if(dishDetails.getDish_name()!=null)
		{
			dish.setDish_name(dishDetails.getDish_name());
		}
		if(dishDetails.getDish_price()!=0	)
		{
			dish.setDish_price(dishDetails.getDish_price());
		}
		repo.save(dish);
		return dish;
	}

	public Dish deleteDish(Dish dishDetails, Integer valueOf) {
		
		return null;
	}

}
