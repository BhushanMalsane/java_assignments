package com.demo.service;
import java.util.*;
import com.demo.dao.*;
import com.demo.beans.*;
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao edao = new EmployeeDaoImpl();
	@Override
	public void addNewEmployee() {
		// TODO Auto-generated method stub
		
		EmployeeDao edao = new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int eid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		Employee e=new Employee(eid,nm,mob);
		edao.save(e);
		
	}

	@Override
	public void writeToFile() {
		// TODO Auto-generated method stub
		edao.writeDataToFile();
		
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public boolean deleteById(int eid) {
		// TODO Auto-generated method stub
		return edao.removeById(eid);
	}

	@Override
	public void ReadFromFile() {
		// TODO Auto-generated method stub
		edao.readDataFromFile();
	}

}
