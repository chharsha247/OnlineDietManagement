package com.example.harsha.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.example.harsha.entity.WeeklyPlan;

public interface WeeklyPlanService {
	public String AddFile(String sendTo,MultipartFile file);
	public List<WeeklyPlan> getAllFiles();
	public List<WeeklyPlan> getFilesByBatch(String batchId);
	public ResponseEntity<byte[]> getFile(int id);
}
