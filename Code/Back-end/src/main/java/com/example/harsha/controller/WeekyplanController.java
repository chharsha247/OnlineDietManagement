package com.example.harsha.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.harsha.dao.WeeklyplanDao;
import com.example.harsha.entity.WeeklyPlan;
import com.example.harsha.service.WeeklyPlanService;

@RestController
@CrossOrigin("*")
public class WeekyplanController {
	@Autowired
	WeeklyplanDao weeklyPlanDao;	
	@Autowired
	WeeklyPlanService weeklyPlanService;
	@PostMapping("/upload")
	public String saveFile(@RequestParam("sendTo") String sendTo,@RequestParam("file") MultipartFile file) throws IOException{
			return weeklyPlanService.AddFile(sendTo, file);
	}
	@GetMapping("getAll/files")
	public List<WeeklyPlan> getAllFiles(){
		return weeklyPlanService.getAllFiles();
		
		
	}
	@GetMapping("getAll/files/{batchId}")
	public List<WeeklyPlan> getFilesByBatch(@PathVariable("batchId") String batchId){
		
		return weeklyPlanService.getFilesByBatch(batchId);
		
	}
	@GetMapping("/getFile/{id}")
	public ResponseEntity<byte[]> getFile(@PathVariable("id") int id){
		
		return weeklyPlanService.getFile(id);
		
	}
}
