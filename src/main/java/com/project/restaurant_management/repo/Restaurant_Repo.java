package com.project.restaurant_management.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.restaurant_management.entity.Dish;

@Repository
public interface Restaurant_Repo  extends JpaRepository<Dish, Integer>{

	@Query(value="select * from dish_table" , nativeQuery = true)
	List<Dish> getall_dishes();

}
