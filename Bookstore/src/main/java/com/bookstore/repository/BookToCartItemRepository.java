package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.domain.BookToCartItem;
import com.bookstore.domain.CartItem;

@Transactional
public interface BookToCartItemRepository extends JpaRepository<BookToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
