package com.example.harsha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.harsha.entity.Dailylog;
import com.example.harsha.service.DailyLogService;

@RestController
@CrossOrigin("*")
public class DailylogController {
	@Autowired
	DailyLogService dailylogService;
	
	@PostMapping("/addDailylog")
	public String addDailylog(@RequestBody Dailylog dailylog) {
		return dailylogService.addDailyLog(dailylog);
	}
	
	@GetMapping("/dailyLogs")
	public List<Dailylog> getAllDailyLogs(){
		return dailylogService.getAllDailyLogs();
	}
}
