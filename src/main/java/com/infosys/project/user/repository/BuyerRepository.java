package com.infosys.project.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.project.user.entity.Buyer;
@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer>{



//	Optional<Buyer> findByEmail(String email);

//	Optional<Buyer> findByphoneNumber(String phonenumber);

	Buyer findByEmail(String email);

//	void deleteById(Integer buyeri


}
