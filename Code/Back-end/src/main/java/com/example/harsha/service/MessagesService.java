package com.example.harsha.service;

import java.util.List;

import com.example.harsha.entity.Messages;

public interface MessagesService {
	public List<Messages> getMessages(String sendTo);
	public List<Messages> getSentMessages(String sendFrom);
	public List<Messages> getMessagesByBatch(String batch);
	public String addMessage(Messages messages);
	
}
