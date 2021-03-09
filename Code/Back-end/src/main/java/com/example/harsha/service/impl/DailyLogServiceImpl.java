package com.example.harsha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.harsha.dao.DailylogDao;
import com.example.harsha.entity.Dailylog;
import com.example.harsha.service.DailyLogService;

@Service
public class DailyLogServiceImpl implements DailyLogService{
	@Autowired
	DailylogDao dailylogDao;
	@Override
	public List<Dailylog> getAllDailyLogs() {
		List<Dailylog> dailylogs= dailylogDao.findAll();
		return dailylogs;
	}
	@Override
	public String addDailyLog(Dailylog dailylog) {
		dailylogDao.save(dailylog);
		return "Added daily Log";
	}

}
