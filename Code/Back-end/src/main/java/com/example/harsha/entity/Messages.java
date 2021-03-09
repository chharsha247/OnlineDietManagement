package com.example.harsha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Messages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mId;
	private String message;
	@Column(name="send_from")
	@JsonProperty(value = "send_from")
	private String sendFrom;
	@Column(name="send_to")
	@JsonProperty(value = "send_to")
	private String sendTo;
	@Column(name="bu_id")
	@JsonProperty(value = "bu_id")
	private String buId;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSendFrom() {
		return sendFrom;
	}
	public void setSendFrom(String sendFrom) {
		this.sendFrom = sendFrom;
	}
	public String getSendTo() {
		return sendTo;
	}
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	
}
