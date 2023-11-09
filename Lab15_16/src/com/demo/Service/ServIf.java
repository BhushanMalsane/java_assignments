package com.demo.Service;

import java.util.ArrayList;

import com.demo.Beans.Employee;

public interface ServIf {

	void addEmp();

	boolean deleteId(int id);

	ArrayList<Employee> displayAll();
	
	void ReadFile();

	void WriteFile();
}
