package com.example.harsha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Measurements {
	@Id
	private String email;
	private int height;
	private int weight;
	private int chest;
	private int waist;
	private int shoulders;
	private int biceps;
	private int leg;
	private int thighs;
	private String month;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getChest() {
		return chest;
	}
	public void setChest(int chest) {
		this.chest = chest;
	}
	public int getWaist() {
		return waist;
	}
	public void setWaist(int waist) {
		this.waist = waist;
	}
	public int getShoulders() {
		return shoulders;
	}
	public void setShoulders(int shoulders) {
		this.shoulders = shoulders;
	}
	public int getBiceps() {
		return biceps;
	}
	public void setBiceps(int biceps) {
		this.biceps = biceps;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getThighs() {
		return thighs;
	}
	public void setThighs(int thighs) {
		this.thighs = thighs;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	} 
}
