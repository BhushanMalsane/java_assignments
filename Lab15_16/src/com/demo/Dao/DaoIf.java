package com.demo.Dao;

import java.util.ArrayList;

import com.demo.Beans.Employee;

public interface DaoIf {

	void save(Employee e);

	boolean deletebyid(int id);

	ArrayList<Employee> getAll();

	void ReadFile();

	void WriteFile();

}
