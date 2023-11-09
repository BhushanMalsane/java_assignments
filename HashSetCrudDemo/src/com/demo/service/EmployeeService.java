package com.demo.service;
import java.util.Set;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
public interface EmployeeService {

	void addnewEmployee(int ch);
	Set <Employee> displayAll();
	Employee displayById(int id);
	Set<Employee> SortByName();
	Set<Employee>SortBySalary();
	boolean updateSalById(int id, int sal);
	
	
}
