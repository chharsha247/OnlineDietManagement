package com.example.harsha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.harsha.dao.UserDao;
import com.example.harsha.entity.User;
import com.example.harsha.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	@Override
	public List<User> getAllUsers() {
		List<User> users= userDao.findAll();
		return users;
	}
	@Override
	public User getUsersByMail(String mail) {
		User user=userDao.findByEmail(mail);
		return user;
	}
	@Override
	public List<User> getUsersByAppovalStatus() {
		List<User> users=userDao.findByApprovalStatus("no");
		return users;
	}
	@Override
	public List<User> getUsersByNewUser() {
		List<User> users=userDao.findByNewUser("yes");
		return users;
	}
	@Override
	public User getUserByUserID(String userId) {
		User user = userDao.findByUserId(userId);
		return user;
	}
	@Override
	public List<User> getUsersByBatchId(String batchId) {
		List<User> users=userDao.findByBatchId(batchId);
		return users;
	}
	@Override
	public String getByReferenceCode(String ref) {
		User user=userDao.findByUserReferenceCode(ref);
		if(user!=null) {
			return "yes";
		}
		else {
			return "no";
		}
	}
	@Override
	public String deleteUserById(String userId) {
		userDao.deleteById(userId);
		return "deleted";
	}
	@Override
	public String updateUserByUserId(String userId, User userToUpdate) {
		User user=userDao.findByUserId(userId);
		user.setApprovalStatus(userToUpdate.getApprovalStatus());
		user.setNewUser(userToUpdate.getNewUser());
		user.setAge(userToUpdate.getAge());
		user.setAddress(userToUpdate.getAddress());
		user.setCity(userToUpdate.getCity());
		user.setCountry(userToUpdate.getCountry());
		user.setDietaryCustom(userToUpdate.getDietaryCustom());
		user.setDietaryRistrictions(userToUpdate.getDietaryRistrictions());
		user.setEmail(userToUpdate.getEmail());
		user.setFullName(userToUpdate.getFullName());
		user.setGender(userToUpdate.getGender());
		user.setHeight(userToUpdate.getHeight());
		user.setMedicalConditions(userToUpdate.getMedicalConditions());
		user.setMobileNumber(userToUpdate.getMobileNumber());
		user.setPinCode(userToUpdate.getPinCode());
		user.setPregnantStatus(userToUpdate.getPregnantStatus());
		user.setReasonForJoining(userToUpdate.getReasonForJoining());
		user.setState(userToUpdate.getState());
		user.setWeight(userToUpdate.getWeight());
		System.out.println("Age"+userToUpdate.getAge());
		userDao.save(user);
		return "User details Updated Successfully...";
	}
	@Override
	public String getUserBatch(String email) {
		User user=userDao.findByEmail(email);
		return user.getBatchId();
	}
	

}
