package com.mlb.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mlb.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
