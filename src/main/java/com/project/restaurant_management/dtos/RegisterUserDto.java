package com.project.restaurant_management.dtos;

import lombok.Data;

@Data
public class RegisterUserDto {
    private String email;
    
    private String password;
    
    private String fullName;
    
}
