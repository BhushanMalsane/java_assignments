package com.demo.beans;

import java.time.LocalDate;

public class Student {
	
	private int sid;
	private String name;
	private LocalDate dob;
	private String deg;
	private double degMarks;
	public Student() {
		super();
	}
	public Student(int sid, String name, LocalDate dob, String deg, double degMarks) {
		super();
		this.sid = sid;
		this.name = name;
		this.dob = dob;
		this.deg = deg;
		this.degMarks = degMarks;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public double getDegMarks() {
		return degMarks;
	}
	public void setDegMarks(double degMarks) {
		this.degMarks = degMarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + ", deg=" + deg + ", degMarks=" + degMarks
				+ "]";
	}
	
	

}
