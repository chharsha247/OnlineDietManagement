package com.example.harsha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.harsha.entity.Messages;
import com.example.harsha.service.MessagesService;

@RestController
@CrossOrigin("*")
public class MessagesController {
	
	@Autowired
	MessagesService messagesService;
	@PostMapping("/addMessage")
	public String addMessage(@RequestBody Messages message) {
		
		return messagesService.addMessage(message);
	}
	@GetMapping("/getMessages/{sendTo}")
	public List<Messages> getMessages(@PathVariable("sendTo") String sendTo){
		return messagesService.getMessages(sendTo);
	}
	@GetMapping("/getMessagesByBatch/{batch}")
	public List<Messages> getMessagesByBatch(@PathVariable("batch")String batch){
		return messagesService.getMessagesByBatch(batch);
	}
	@GetMapping("/getSentMessages/{sendFrom}")
	public List<Messages> getSentMessages(@PathVariable("sendFrom") String sendFrom){
		return messagesService.getSentMessages(sendFrom);
	}
	
}
