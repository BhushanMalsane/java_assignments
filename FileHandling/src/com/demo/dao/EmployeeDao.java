package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	void writeDataToFile();

	List<Employee> findAll();

	boolean removeById(int eid);

	void readDataFromFile();

	
}
