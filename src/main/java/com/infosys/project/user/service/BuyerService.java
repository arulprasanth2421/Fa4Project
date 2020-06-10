package com.infosys.project.user.service;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.project.user.dto.BuyerDTO;
import com.infosys.project.user.dto.CartDTO;
import com.infosys.project.user.dto.LoginDTO;
import com.infosys.project.user.dto.ProductDTO;
import com.infosys.project.user.dto.WishlistDTO;
import com.infosys.project.user.entity.Buyer;
import com.infosys.project.user.entity.Cart;
import com.infosys.project.user.entity.Wishlist;
import com.infosys.project.user.repository.BuyerRepository;
import com.infosys.project.user.repository.CartRepository;
import com.infosys.project.user.repository.WishlistRepository;
import com.infosys.project.user.validator.Validator;

@Service
public class BuyerService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BuyerRepository buyerRepository;
	
	@Autowired
	WishlistRepository wishlistRepository;
	
	@Autowired
	CartRepository cartRepository;
	
	
//	public boolean register(BuyerDTO buyerDto) throws Exception {
//		Validator.buyerValidate(buyerDto);
//		try {
//		Buyer buyer=buyerDto.register(buyerDto);
//		buyerRepository.save(buyer);
//		return true;
//		}catch (Exception e){
//			return false;
//		}s
//}
	public String registerUser(BuyerDTO buyerDTO) throws Exception {
		logger.info("Registration request for user {}", buyerDTO);
		System.out.println(" not ok");
		Buyer be=buyerDTO.createEntity();
		System.out.println("ok");
		Validator.buyerValidate(buyerDTO);
		System.out.println("doctor");
		buyerRepository.save(be);
		return("new user new created");
		}


public boolean Buyerlogin(LoginDTO loginDTO) {
		
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(), loginDTO.getPassword());
		Validator.emailid(loginDTO.getEmail());
		Buyer optBuyer = buyerRepository.findByEmail(loginDTO.getEmail());
		if (optBuyer.getPassword().equals(loginDTO.getPassword())) {
				return true;
			}
		return false;
	}
		
		

		
		public void removebuyer(Integer buyerid) {
			buyerRepository.deleteById(buyerid);
		}
		
		public void addtocart(CartDTO cartDTO) {
			System.out.println("in service");
			CartDTO cart1=new CartDTO();
			cart1.setBuyerid(500);
			cart1.setProdid(cartDTO.getProdid());
			cart1.setQuantity(cartDTO.getQuantity());
			Cart cart2= cart1.createEntity();
			cartRepository.save(cart2);
			
		}
		
	
		public void addtowishlist(ProductDTO prodDTO) {
		System.out.println("in service");
		WishlistDTO wishlist=new WishlistDTO();
		wishlist.setBuyerid(543);
		wishlist.setProdid(prodDTO.getProdid());
		
	
			WishlistDTO wo= new WishlistDTO();
			Wishlist we= wishlist.createEntity();
			wishlistRepository.save(we);

		
	}
	public void delete(Integer buyerid) {
		
		wishlistRepository.deleteById(buyerid);
		
	}
	
	

}
