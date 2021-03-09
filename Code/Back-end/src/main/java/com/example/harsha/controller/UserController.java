package com.example.harsha.controller;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.harsha.dao.UserDao;
import com.example.harsha.entity.User;
import com.example.harsha.service.UserService;
import com.example.harsha.util.Mail;

@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserDao userDao;
	@Autowired
	private Mail m;
	@Autowired
	private UserService userService;
	
	//Get All Users
	@GetMapping("/users")
	public List<User> findAllUsers(){
		return userService.getAllUsers();
	}
	
	
	//Get User by Email
	@GetMapping("/users/{email}")
	public User findByEmail(@PathVariable String email){
		return userService.getUsersByMail(email);
	}
	//Get User By Approval Status
	@GetMapping("/users/byApprovalStatus")
	public List<User> findByUserType(){
		return userService.getUsersByAppovalStatus();
	}
	//Get Users By New User
	@GetMapping("/byNewUser")
	public List<User> findByNewUser(){
		return userService.getUsersByNewUser();
	}
	
	//Get user by user Id
	@GetMapping("/userbyUserId/{userId}")
	public User findByUserId(@PathVariable String userId) {
		return userService.getUserByUserID(userId);
	}
	
	//Get Users by Batch Id
	@GetMapping("/usersByBatchId/{batchId}")
	public List<User> findByBatchId(@PathVariable("batchId") String batchId){
		return userService.getUsersByBatchId(batchId);
	}
	
	//Sending Email
	@GetMapping("/sendAcceptMail/{email}")
	public String sendAcceptMail(@PathVariable String email) throws IOException, MessagingException {
		
		return m.sendAcceptMail(email);
	}
	@GetMapping("/sendRejectMail/{email}")
	public String sendRejectMail(@PathVariable String email) throws IOException, MessagingException {
		
		return m.sendRejectMail(email);
	}
	
	//Add User
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userDao.save(user);
		return "Hi, "+user.getFullName()+" your details added successfully waiting for Admin's Approval";
	}
	
	//Updating User
	@PutMapping("/updateUser/{userId}")
	public String updateUser(@PathVariable String userId,@RequestBody User userToUpdate) {
		return userService.updateUserByUserId(userId, userToUpdate);
	}
	
	//Delete User
	@DeleteMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable String userId) {
		return userService.deleteUserById(userId);
	}
	
	//User by referral code
	@GetMapping("/userByReference/{userReferenceCode}")
	public String getByUserRefCode(@PathVariable("userReferenceCode")String ref) {
		return userService.getByReferenceCode(ref);
	}
	@GetMapping("/batchId/{email}")
	public String getUserId(@PathVariable("email")String mail) {
		return userService.getUserBatch(mail);
	}

}
