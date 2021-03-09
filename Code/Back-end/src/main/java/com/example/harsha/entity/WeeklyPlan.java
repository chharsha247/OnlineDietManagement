package com.example.harsha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

@Entity
@Service
public class WeeklyPlan {
	
	
	public WeeklyPlan() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public WeeklyPlan(String fileName, String fileType, String sendto, byte[] fileByte) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.sendto = sendto;
		this.fileByte = fileByte;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "file_name")
	private String fileName;
	@Column(name="file_type")
	private String fileType;
	private String sendto;
	@Column(name = "file_byte",length = 10000000)
	private byte[] fileByte;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getSendto() {
		return sendto;
	}
	public void setSendto(String sendto) {
		this.sendto = sendto;
	}
	public byte[] getFileByte() {
		return fileByte;
	}
	public void setFileByte(byte[] fileByte) {
		this.fileByte = fileByte;
	}
	
	
}
