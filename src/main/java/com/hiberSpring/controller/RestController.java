package com.hiberSpring.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hiberSpring.beans.Response;
import com.hiberSpring.beans.User;

public class RestController {
	
	
	
	@PostMapping(value = "/users")
    public ResponseEntity<Response> searchName(@RequestBody User user) {
		HttpHeaders headers = new HttpHeaders();
		ResponseEntity<Response> respEntity = null;
		Response response=new Response();
		
		respEntity = ResponseEntity.ok().headers(headers).body(response);
		
		return respEntity;
    }
}
