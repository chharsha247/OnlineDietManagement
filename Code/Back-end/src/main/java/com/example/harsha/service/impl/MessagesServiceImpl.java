package com.example.harsha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.harsha.dao.MessagesDao;
import com.example.harsha.entity.Messages;
import com.example.harsha.service.MessagesService;

@Service
public class MessagesServiceImpl implements MessagesService{
	@Autowired
	MessagesDao messagesDao;
	@Override
	public List<Messages> getMessages(String sendTo) {
		List<Messages> messages=messagesDao.findBySendTo(sendTo);
		return messages;
	}
	@Override
	public List<Messages> getSentMessages(String sendFrom) {
		List<Messages> messages=messagesDao.findBySendFrom(sendFrom);
		return messages;
	}
	@Override
	public String addMessage(Messages message) {
		messagesDao.save(message);
		return "Message added successfully";
	}
	@Override
	public List<Messages> getMessagesByBatch(String batch) {
		List<Messages> messages=messagesDao.findByBuId(batch);
		return messages;
	}

}
