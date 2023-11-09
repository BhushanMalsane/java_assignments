package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	
	void addNewEmployee();

	void writeToFile();

	List<Employee> getAllEmployees();

	boolean deleteById(int eid);

	void ReadFromFile();


	
	
	
	
}
