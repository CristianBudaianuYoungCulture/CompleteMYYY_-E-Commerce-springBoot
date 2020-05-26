package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.security.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByname(String name);
}
