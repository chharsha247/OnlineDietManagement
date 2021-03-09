package com.example.harsha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.harsha.dao.MeasurementsDao;
import com.example.harsha.entity.Measurements;
import com.example.harsha.service.MeasurementsService;
@Service
public class MeasurementsServiceImpl implements MeasurementsService{
	@Autowired
	MeasurementsDao measurementsDao;
	@Override
	public List<Measurements> getAllMeasures() {
		return measurementsDao.findAll();
	}

	@Override
	public String addMeasures(Measurements measurements) {
		measurementsDao.save(measurements);
		return "Added MeasrementsSuccessfully";
	}

}
