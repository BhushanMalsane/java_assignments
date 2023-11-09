package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	
	
	static EmployeeDao edao=new EmployeeDaoImpl();
	@Override
	public void addEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the salary");
		double sal = sc.nextDouble();
		
		Employee e=new Employee(id,name,sal);
		edao.save(e);
		
	}
	@Override
	public void sort(Object object) {
		edao.sorting(object);
		
	}
	@Override
	public void sorting() {
		edao.sortbyid();
		
	}
	
	
}
