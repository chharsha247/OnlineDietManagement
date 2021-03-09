package com.example.harsha.util;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.harsha.dao.CredentialsDao;
import com.example.harsha.dao.UserDao;
import com.example.harsha.entity.Credentials;
import com.example.harsha.entity.User;

@Component
public class Mail {
	@Autowired
	UserDao userDao;
	@Autowired
	CredentialsDao credDao;
	@Autowired
    private JavaMailSender javaMailSender;
	public String sendAcceptMail(String email) throws IOException, MessagingException {
			
			User user=userDao.findByEmail(email);
			Credentials cred=credDao.findByEmail(email);
			System.out.println(user.getEmail());
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(email);
	
			msg.setSubject("Your Request is approved");
			msg.setText("Congratulations!!!!!!!!!!!\n"+
					"Welcome to Online Dietary program.\n"+
					"Your Unique UserId is:\t"+user.getUserId()+"\n"+
					"Your Reference Code is:\t"+user.getReferralCode()+"\n"+
					"Your Initial Password is:\t"+cred.getPassword());
	
			javaMailSender.send(msg);
		    return "Done";
	}
	public String sendRejectMail(@PathVariable String email) throws IOException, MessagingException {
		
		User user=userDao.findByEmail(email);
		System.out.println(user.getEmail());
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);

		msg.setSubject("Your Request is Rejected");
		msg.setText("Sorry, Your request to Online Dietary program is Rejected by admin.\n"+
		"Please try after somedays.");

		javaMailSender.send(msg);
	    return "Done";
	}
}
