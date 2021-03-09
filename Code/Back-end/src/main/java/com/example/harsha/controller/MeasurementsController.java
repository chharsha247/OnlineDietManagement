package com.example.harsha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.harsha.entity.Measurements;
import com.example.harsha.service.MeasurementsService;

@RestController
@CrossOrigin("*")
public class MeasurementsController {
	@Autowired
	MeasurementsService measurementsService;
	@PostMapping("/addMeasurements")
	public String addMeasurements(@RequestBody Measurements measurements) {
		return measurementsService.addMeasures(measurements);
	}
	
	@GetMapping("/monthlyMeasures")
	public List<Measurements> getAllMeasures(){
		List<Measurements> measures= measurementsService.getAllMeasures();
		return measures;
	}
}
