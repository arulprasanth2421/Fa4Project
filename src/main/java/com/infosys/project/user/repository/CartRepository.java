package com.infosys.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.project.user.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
