package com.example.harsha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.harsha.entity.Credentials;
@Repository
public interface CredentialsDao extends JpaRepository<Credentials, String>{
	
	public Credentials findByEmail(String email);

}
