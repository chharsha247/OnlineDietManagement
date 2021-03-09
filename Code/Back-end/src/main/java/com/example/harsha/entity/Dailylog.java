package com.example.harsha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dailylog {
	@Id
	private String email;
	private String date;
	private String breakfast;
	private String lunch;
	private String dinner;
	private String fruits;
	private String vegetables;
	private String workout;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public String getFruits() {
		return fruits;
	}
	public void setFruits(String fruits) {
		this.fruits = fruits;
	}
	public String getVegetables() {
		return vegetables;
	}
	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}
	public String getWorkout() {
		return workout;
	}
	public void setWorkout(String workout) {
		this.workout = workout;
	}

}
