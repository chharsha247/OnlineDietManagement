package com.example.harsha.service;

import java.util.List;

import com.example.harsha.entity.User;



public interface UserService {
	public List<User> getAllUsers();
	public User getUsersByMail(String mail);
	public List<User> getUsersByAppovalStatus();
	public List<User> getUsersByNewUser();
	public User getUserByUserID(String userId);
	public List<User> getUsersByBatchId(String batchId);
	public String getByReferenceCode(String ref);
	public String deleteUserById(String userId);
	public String updateUserByUserId(String userId,User user);
	public String getUserBatch(String email);
}
