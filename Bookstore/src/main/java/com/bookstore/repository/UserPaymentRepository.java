package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.UserPayment;

public interface UserPaymentRepository extends JpaRepository<UserPayment, Long>{
}
