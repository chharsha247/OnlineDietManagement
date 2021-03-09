package com.example.harsha.service;

import java.util.List;

import com.example.harsha.entity.Dailylog;

public interface DailyLogService {
	public List<Dailylog> getAllDailyLogs();
	public String addDailyLog(Dailylog dailylog);
}
