package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

static List<Employee> ls;
	
	static {
		ls=new ArrayList<>();
		ls.add(new Employee(12,"Pranav",1200));
		ls.add(new Employee(13,"Somesh",100));
		ls.add(new Employee(14,"Arnav",1200));
		ls.add(new Employee(15,"Sanket",1300));
	}
	@Override
	public void save(Employee e) {
		ls.add(e);
		
	}
	@Override
	public void sorting(Object object) {
		ls.sort(null);
		System.out.println(ls);
		
	}
	@Override
	public void sortbyid() {
		Comparator<Employee> myid=(o1,o2)->{
			return o1.getEid()-o2.getEid();
		};
		
		ls.sort(myid);
		System.out.println("sort by comparator by id");
		System.out.println(ls);
		
	}
	

	
	

}
