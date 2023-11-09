package com.demo.service;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.beans.ContractEmployee;
import com.demo.beans.SalariedEmployee;
import com.demo.beans.Vendor;
import com.demo.dao.EmployeeDaoImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeDao edao;
	
	public EmployeeServiceImpl()
	{
		edao = new EmployeeDaoImpl();
	}
	@Override
	public void addnewEmployee(int ch) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("enter date of joining(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e;
		if(ch==1) {
			System.out.println("enter salary");
			int s=sc.nextInt();
			System.out.println("enter bonus");
			int b=sc.nextInt();
			 e=new SalariedEmployee (pid, nm, mob, em, dept, desg, ldt, s, b);
		}
		else if (ch==2) {
			System.out.println("enter Hrs");
			int hrs=sc.nextInt();
			System.out.println("enter charges per hour");
			int charges=sc.nextInt();
			 e=new ContractEmployee(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
		}
		else {
			//vendor details
			System.out.println("enter No of employees");
			int noofemployee=sc.nextInt();
			System.out.println("Enter amount");
			int amount=sc.nextInt();
			 e=new Vendor(pid, nm, mob, em, dept, desg, ldt,noofemployee,amount );
			
		}
		edao.save(e);
		
	}
	@Override
	public Set<Employee> displayAll() {
		// TODO Auto-generated method stub
		
		return edao.getAll();
	}
	@Override
	public Employee displayById(int id) {
		// TODO Auto-generated method stub
		return edao.getById(id);
	}
	@Override
	public Set<Employee> SortByName() {
		// TODO Auto-generated method stub
		return  edao.sortByName();
		
	}
	@Override
	public Set<Employee> SortBySalary() {
		// TODO Auto-generated method stub
		return edao.sortBySalary() ;
	}
	@Override
	public boolean updateSalById(int id, int sal) {
		// TODO Auto-generated method stub
		return edao.modifySalById(id,sal);
	}
		
	}


