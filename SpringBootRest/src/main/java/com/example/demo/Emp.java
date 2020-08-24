package com.example.demo;

import java.util.Date;

public class Emp {
	private long eID;
	private String eName;
	private String dptName;
	private Date createdDate;
	
	public Emp() {
		super();
	}

	public Emp(long eID, String eName, String dptName, Date createdDate) {
		super();
		this.eID = eID;
		this.eName = eName;
		this.dptName = dptName;
		this.createdDate = createdDate;
	}

	



	public long geteID() {
		return eID;
	}

	public void seteID(long eID) {
		this.eID = eID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDptName() {
		return dptName;
	}

	public void setDptName(String dptName) {
		this.dptName = dptName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	

}
