package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentState {

	@Id
	private int sid;
	
	private String name;
	private String city;
	
	private CertificateState certi;
	
	public StudentState(int sid, String name, String city) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
	}

	public StudentState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public CertificateState getCerti() {
		return certi;
	}

	public void setCerti(CertificateState certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.sid+":"+this.name+":"+this.city;
	}
	
	
	
	
}
