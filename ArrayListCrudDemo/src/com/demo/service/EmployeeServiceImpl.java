package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeDao edo ; 
	public EmployeeServiceImpl()
	{
		edo = new EmployeeDaoImpl();
	}
	
	@Override
	public void addNewService(int ch) {
		// TODO Auto-generated method stub
		if(ch==1)
		{
			
		}
		
	}
	
	

}
