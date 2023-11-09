
package com.demo.beans;

import java.util.Objects;

public class Person implements Comparable<Employee>{
	
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
	public int hashCode() {
		// TODO Auto-generated method stub
		return pid;
		//return Objects.hash(pid,pname);
		//return Objects.hash(pname);

	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	return this.pid == ((Person)obj).pid  ;
   //		return this.pid == ((Person)obj).pid && this.pname == ((Person)obj).pname;
	//	return this.pname == ((Person)obj).pname;

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
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.pname.compareTo(((Person)o).pname);
	}

}
