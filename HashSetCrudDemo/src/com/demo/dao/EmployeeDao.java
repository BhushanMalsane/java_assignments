package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {
	
	void save(Employee e);
	Set<Employee> getAll();
	Employee getById(int id);
	Set<Employee> sortByName();
	Set<Employee> sortBySalary();
	boolean modifySalById(int id, int sal);
	
	

}
