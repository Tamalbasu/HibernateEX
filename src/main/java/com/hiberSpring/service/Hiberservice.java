package com.hiberSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiberSpring.beans.Response;
import com.hiberSpring.beans.User;
import com.hiberSpring.dao.HiberDao;

@Service
public class Hiberservice {
	
	@Autowired
	HiberDao hiberDao;
	@Autowired
	Response response;
	
	
	public Response adduser(User user){
		boolean flag=hiberDao.adduser(user);
		if(flag){
			response.setMessege("Insert successfull");
			response.setCode(200);
		}else{
			response.setMessege("Insert not successfull");
			response.setCode(404);
		}
		return response;
		
	}
	

}
