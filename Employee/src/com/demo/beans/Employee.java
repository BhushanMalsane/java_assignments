package com.demo.beans;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private double sal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id) {
		this.eid=id;
		
	}
	public boolean equals(Object ob) {
		return this.eid==((Employee)ob).eid;
	}
	
	
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]\n";
	}
	
	public int compareTo(Employee o1) {
		
//		return (int)(this.sal-o1.sal);
		return this.ename.compareTo(o1.ename);
	}
}
