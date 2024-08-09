package com.project.restaurant_management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
@Entity
@Table(name="user_table")
public class User implements UserDetails{
		
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(nullable = false)
	    private int id;

	    @Column(nullable = false)
	    private String fullName;

	    @Column(unique = true, length = 100, nullable = false)
	    private String email;
	    

	    @Column(nullable = false)
	    private String password;
	    
	    
	    @CreationTimestamp
	    @Column(updatable = false, name = "created_at")
	    private Date createdAt;

	    @UpdateTimestamp
	    @Column(name = "updated_at")
	    private Date updatedAt;

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
	        return List.of();
	    }

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return email;
		}


	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }
	
}
