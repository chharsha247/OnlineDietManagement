package com.example.harsha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.harsha.entity.Credentials;
import com.example.harsha.service.CredentialsService;

@RestController
@CrossOrigin("*")
public class CredentialsController {
	@Autowired
	CredentialsService credentiasService;
	
	@PostMapping("/login")
	public String login(@RequestBody Credentials credentials) {
		return credentiasService.login(credentials);
	}
	@PostMapping("/addCredentials")
	public String addUser(@RequestBody Credentials cred) {
		return credentiasService.addUser(cred);
	}
}
