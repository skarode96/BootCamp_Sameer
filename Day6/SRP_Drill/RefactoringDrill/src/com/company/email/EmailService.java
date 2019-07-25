package com.company.email;

import com.company.location.LocationService;
import com.company.security.SecurityService;

class EmailService{

	private final SecurityService security = new SecurityService();

	void sendEmail(String user, String email, String message){
		if(LocationService.retrieveLocation(email) == "USA"){
			if(SecurityService.checkPermission(user)){
				if(exists(email)){
					System.out.println("Email is sent to "+email+ " with message : "+message);
				}
			}
		}
	}	


	boolean exists(String email){
		//20 loc to check in DB
		if(email.endsWith("@yahoo.com")) {
			return true;
		}else{
			return false;
		}
	}



}