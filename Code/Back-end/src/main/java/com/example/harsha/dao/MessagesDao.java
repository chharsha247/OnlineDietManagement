package com.example.harsha.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.harsha.entity.Messages;

@Repository
public interface MessagesDao extends JpaRepository<Messages, Integer>{
	public List<Messages> findBySendTo(String mail);
	public List<Messages> findBySendFrom(String mail);
	public List<Messages> findByBuId(String batch);
}
