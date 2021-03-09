package com.example.harsha.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.harsha.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{
	//@Query(value="select * from User u where u.email =: email", nativeQuery=true)
	public User findByEmail(String email);
	
	public List<User> findByApprovalStatus(String approvalStatus);
	
	public User findByUserId(String userId);
	
	public List<User> findByNewUser(String newUser);
	
	public List<User> findByBatchId(String batchId);
	
	public User findByUserReferenceCode(String ref);
}
