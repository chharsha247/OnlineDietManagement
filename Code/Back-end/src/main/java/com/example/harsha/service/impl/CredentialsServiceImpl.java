package com.example.harsha.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.harsha.dao.CredentialsDao;
import com.example.harsha.entity.Credentials;
import com.example.harsha.service.CredentialsService;
@Service
public class CredentialsServiceImpl implements CredentialsService{
	@Autowired
	CredentialsDao credentialsDao;
	@Override
	public String login(Credentials credentials) throws NullPointerException {
		String result="";
		System.out.println(credentials.getEmail());
		Credentials cred=credentialsDao.findByEmail(credentials.getEmail());
		try {
			if(!cred.equals(null)) {
				if((cred.getEmail().equals(credentials.getEmail()))&&(cred.getPassword().equals(credentials.getPassword()))) {
					result+="true "+cred.getEmail()+" "+cred.getUserType();
					System.out.println(credentials.getEmail()+" "+cred.getEmail());
				}
				else if((cred.getEmail().equals(credentials.getEmail()))&&(!(cred.getPassword().equals(credentials.getPassword())))) {
					result+= "false Invalid Password";
				}
			}
		}
		catch(Exception e) {
			result+="false User Doesnot exist Please Register";
		}
		return result;
	}
	@Override
	public String addUser(Credentials cred) {
		credentialsDao.save(cred);
		return "Hi, "+cred.getEmail()+" your details added successfully waiting for Admin's Approval";
	}

}
