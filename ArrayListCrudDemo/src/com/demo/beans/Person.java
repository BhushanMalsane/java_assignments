package com.demo.beans;

public class Person {
	
	private int pid;
	private String pname;
	private String email;
	private String mobile;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int pid, String pname, String email, String mobile) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", email=" + email + ", mobile=" + mobile + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
