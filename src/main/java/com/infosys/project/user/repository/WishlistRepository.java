package com.infosys.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.project.user.entity.Buyer;
import com.infosys.project.user.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer>{
	

}
