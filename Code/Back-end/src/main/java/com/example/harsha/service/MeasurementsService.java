package com.example.harsha.service;

import java.util.List;

import com.example.harsha.entity.Measurements;

public interface MeasurementsService {
	public List<Measurements> getAllMeasures();
	public String addMeasures(Measurements measurements);
}
