package com.demo.Service;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.Beans.Employee;
import com.demo.Dao.DaoIf;
import com.demo.Dao.DaoImpl;

public class ServImp implements ServIf {
	private DaoIf dao;
	public ServImp() {
		dao = new DaoImpl();
	}
	@Override
	public void addEmp() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner("Enter ID");
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Mobile");
		String mob =sc.next();
		Employee e =new Employee(id,name,mob) ;
		dao.save(e);
	}
	@Override
	public boolean deleteId(int id) {
		// TODO Auto-generated method stub
		return dao.deletebyid(id);
	}
	@Override
	public ArrayList<Employee> displayAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	@Override
	public void ReadFile() {
		// TODO Auto-generated method stub
		dao.ReadFile();
	}
	@Override
	public void WriteFile() {
		// TODO Auto-generated method stub
		dao.WriteFile();
	}
}
