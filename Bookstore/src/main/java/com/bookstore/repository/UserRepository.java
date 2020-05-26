package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}
