package com.infosys.project.user.validator;

import com.infosys.project.user.dto.BuyerDTO;
import com.infosys.project.user.dto.SellerDTO;

public class Validator {
	public static void buyerValidate(BuyerDTO buyerDto) throws Exception {
		if(!(name(buyerDto.getName()))) {
			throw new Exception("Name is not valid");
		}
		else if(!(emailid(buyerDto.getEmail()))) {
			throw new Exception("EmailID is not valid");
		}
		else if(!(contactno(buyerDto.getPhoneNumber()))) {
			throw new Exception("Phone Number is not valid");
		}
		else if(!(password(buyerDto.getPassword()))) {
			throw new Exception("Phone Number is not valid");
			}
		}
	
		public static boolean name(String name) {
			if(name.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$")) {
				System.out.println("1");
				return true;
			}
			else {
				return false;
			}}
			
			
		
		public static boolean emailid(String mail) {
			if(mail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
					"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
				System.out.println("2");
				return true;
			}else {
				return false;
			}}
			
		
		public static boolean contactno(String number) {
			//String a=Long.toString(number);
			if(number.matches("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$")){
				System.out.println("3");
				return true;
			}else {
				return false;
			}
		}
		
		public static boolean password(String password) {
			if(password.matches("^(?=.*[0-9])"
	                + "(?=.*[a-z])(?=.*[A-Z])"
	                + "(?=.*[@#$%^&+=])"
	                + "(?=\\S+$).{7,20}$")) {
				System.out.println("4");
				return true;
			}else {
				return false;
			}
			
		
	}}