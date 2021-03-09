package com.example.harsha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.harsha.entity.Measurements;
@Repository
public interface MeasurementsDao extends JpaRepository<Measurements, String>{

}
