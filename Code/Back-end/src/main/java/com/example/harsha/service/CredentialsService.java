package com.example.harsha.service;

import com.example.harsha.entity.Credentials;

public interface CredentialsService {
	public String login(Credentials credentials);
	public String addUser(Credentials cred);
}
