package com.example.harsha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.harsha.entity.Dailylog;
@Repository
public interface DailylogDao extends JpaRepository<Dailylog, String>{

}
