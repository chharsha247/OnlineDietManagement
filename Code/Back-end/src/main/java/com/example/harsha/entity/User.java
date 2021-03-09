package com.example.harsha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User {
	@Id
	@Column(name="user_id")
	private String userId;
	@Column(name="full_name")
	private String fullName;
	private int age;
	private String gender;
	@Column(name="mobile_number")
	private Long mobileNumber;
	@Column(unique = true)
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	@Column(name="pin_code")
	private Long pinCode;
	private int height;
	private int weight;
	@Column(name="reason_for_joining")
	private String reasonForJoining;
	@Column(name="medical_conditions")
	private String medicalConditions;
	@Column(name="dietary_ristrictions")
	private String dietaryRistrictions;
	@Column(name="dietary_custom")
	private String dietaryCustom;
	@Column(name="pregnant_status",nullable = true)
	private String pregnantStatus;
	@Column(name="referral_code")
	private String referralCode;
	@Column(name="user_reference_code")
	private String userReferenceCode;
	private int bmi;
	@Column(name="approval_status")
	private String approvalStatus;
	@Column(name="new_user")
	private String newUser;
	@Column(name = "batch_id")
	@JsonProperty(value = "batch_id")
	private String batchId;
	public String getNewUser() {
		return newUser;
	}
	public void setNewUser(String newUser) {
		this.newUser = newUser;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
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
	public String getReasonForJoining() {
		return reasonForJoining;
	}
	public void setReasonForJoining(String reasonForJoining) {
		this.reasonForJoining = reasonForJoining;
	}
	public String getMedicalConditions() {
		return medicalConditions;
	}
	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}
	public String getDietaryRistrictions() {
		return dietaryRistrictions;
	}
	public void setDietaryRistrictions(String dietaryRistrictions) {
		this.dietaryRistrictions = dietaryRistrictions;
	}
	public String getDietaryCustom() {
		return dietaryCustom;
	}
	public void setDietaryCustom(String dietaryCustom) {
		this.dietaryCustom = dietaryCustom;
	}
	public String getPregnantStatus() {
		return pregnantStatus;
	}
	public void setPregnantStatus(String pregnantStatus) {
		this.pregnantStatus = pregnantStatus;
	}
	public String getReferralCode() {
		return referralCode;
	}
	public void setReferralCode(String referralCode) {
		//this.referralCode = "REF"+(this.count++)+this.fullName.substring(0, 3);
		this.referralCode= referralCode;
	}
	public int getBmi() {
		return bmi;
	}
	public void setBmi(int bmi) {
		//this.bmi = this.weight/(this.height*this.height);
		this.bmi=bmi;
	}
	public String getUserReferenceCode() {
		return userReferenceCode;
	}
	public void setUserReferenceCode(String userReferenceCode) {
		this.userReferenceCode = userReferenceCode;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	
}
