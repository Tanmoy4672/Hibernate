package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class CertificateState {

	private String Course;
	private String duration;

	public CertificateState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CertificateState(String course, String duration) {
		super();
		Course = course;
		this.duration = duration;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
