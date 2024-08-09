package com.project.restaurant_management.repo; 

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.restaurant_management.entity.User;

@Repository
public interface User_repo extends JpaRepository<User, Integer> {
	  Optional<User> findByEmail(String email);

}
