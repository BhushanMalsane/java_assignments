package com.demo.beans;


import java.time.LocalDate;

public class Vendor extends  Employee {

	private int noofemployee;
	private int amount;
	
	
	public Vendor(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj,
			int noofemployee, int amount) {
		super(pid, pname, mobile, email, dept, desg, doj);
		this.noofemployee = noofemployee;
		this.amount = amount;
	}


	public int getNoofemployee() {
		return noofemployee;
	}


	public void setNoofemployee(int noofemployee) {
		this.noofemployee = noofemployee;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return super.toString()  + "Vendor [noofemployee=" + noofemployee + ", amount=" + amount + "]";
	}
	
	public double calculateSal()
	{
		return amount * noofemployee;
	}
}
