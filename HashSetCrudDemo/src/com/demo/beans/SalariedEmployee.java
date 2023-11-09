package com.demo.beans;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

	
	private int sal ;
	private int bonus ;
	
	public SalariedEmployee(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj,
			int sal, int bonus) {
		super(pid, pname, mobile, email, dept, desg, doj);
		this.sal = sal;
		this.bonus = bonus;
	}


	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [sal=" + sal + ", bonus=" + bonus + "]";
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public double calculateSal()
	{
		return sal+1000+bonus;
	}
	
	public double calculateBonus()
	{
		return sal *0.10+bonus;
	}
	
	
	
}
