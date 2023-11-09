package com.demo.beans;

import java.time.LocalDate;

public class ContractEmployee extends Employee {
	
	private int hrs;
	private int charges;
	
	
	public ContractEmployee(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj,
			int hrs, int charges) {
		super(pid, pname, mobile, email, dept, desg, doj);
		this.hrs = hrs;
		this.charges = charges;
	}


	public int getHrs() {
		return hrs;
	}


	public void setHrs(int hrs) {
		this.hrs = hrs;
	}


	public int getCharges() {
		return charges;
	}


	public void setCharges(int charges) {
		this.charges = charges;
	}


	@Override
	public String toString() {
		return  super.toString() +"ContractEmployee [hrs=" + hrs + ", charges=" + charges + "]";
	}

	public double calculateSal() {
		return hrs*charges;
	}
	
	
	


}
