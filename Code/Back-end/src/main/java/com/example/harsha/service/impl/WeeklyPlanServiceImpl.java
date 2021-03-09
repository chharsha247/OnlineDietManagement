package com.example.harsha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.harsha.dao.WeeklyplanDao;
import com.example.harsha.entity.WeeklyPlan;
import com.example.harsha.service.WeeklyPlanService;

@Service
public class WeeklyPlanServiceImpl implements WeeklyPlanService{
	@Autowired
	WeeklyplanDao weeklyPlanDao;
	@Override
	public String AddFile(String sendTo, MultipartFile file) {
		try 
	      {
	       	WeeklyPlan weeklyPlan = new WeeklyPlan(file.getOriginalFilename(), file.getContentType(),sendTo, file.getBytes());
	       	weeklyPlanDao.save(weeklyPlan);
	        return "File uploaded successfully! -> filename = " + file.getOriginalFilename();
	      }
	      catch (Exception e)
	      {
	      return "FAIL! Maybe You had uploaded the file before or the file's size > 500KB";
	      }
	}
	@Override
	public List<WeeklyPlan> getAllFiles() {
		return weeklyPlanDao.findAll();
	}
	@Override
	public List<WeeklyPlan> getFilesByBatch(String batchId) {
		return weeklyPlanDao.findBySendto(batchId);
	}
	@Override
	public ResponseEntity<byte[]> getFile(int id) {
		WeeklyPlan file = weeklyPlanDao.findById(id);
	    
	    if(!file.equals(null)) {
	      return ResponseEntity.ok()
	          .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFileName() + "\"")
	          .contentType(MediaType.parseMediaType(file.getFileType()))
	          .body(file.getFileByte());  
	    }
	return ResponseEntity.status(404).body(null);
	}

}
