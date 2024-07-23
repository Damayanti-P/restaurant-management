package com.project.restaurant_management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.restaurant_management.entity.Dish;

@Repository
public interface Restaurant_Repo  extends JpaRepository<Dish, Integer>{

}
