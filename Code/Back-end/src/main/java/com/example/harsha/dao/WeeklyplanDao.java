package com.example.harsha.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.harsha.entity.WeeklyPlan;

public interface WeeklyplanDao extends JpaRepository<WeeklyPlan, Integer>{
	
	//public WeeklyPlan findBySendto(String sendto);
	public WeeklyPlan findById(int id);
	public List<WeeklyPlan> findBySendto(String batchId);
}
