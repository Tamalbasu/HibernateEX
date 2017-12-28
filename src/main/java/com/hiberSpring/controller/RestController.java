package com.hiberSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hiberSpring.beans.Response;
import com.hiberSpring.beans.User;
@Controller
public class RestController {
	
	@Autowired
	HttpHeaders headers;
	@PostMapping(value = "/users")
    public ResponseEntity<Response> searchName(@RequestBody User user) {
		ResponseEntity<Response> respEntity = null;
		Response response=new Response();
		
		respEntity = ResponseEntity.ok().headers(headers).body(response);
		
		return respEntity;
    }
}
