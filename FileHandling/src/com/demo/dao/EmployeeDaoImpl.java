package com.demo.dao;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	
	static List<Employee> elist;
	
	static 
	{
		elist = new ArrayList<>();
	}

	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		
		elist.add(e);
	
		
	}

	@Override
	public void writeDataToFile() {
		// TODO Auto-generated method stub
		
		
		try(BufferedWriter  bos = new BufferedWriter(new FileWriter("empcrud.txt"));)
		{
			for(Employee e : elist)
			{
				bos.write(e.getEid() + ", "+ e.getEname()+", "+e.getMobile() + "\n");
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return elist;
	}

	@Override
	public boolean removeById(int eid) {
		// TODO Auto-generated method stub
		return elist.remove(new Employee(eid,null,null));
	}

	@Override
	public void readDataFromFile() {
		// TODO Auto-generated method stub
		try(BufferedReader bis=new BufferedReader(new FileReader("empcrud.txt")); ) {
			String str=bis.readLine();
			while(str!=null) {
				String[] strarr=str.split(",");
				Employee e=new Employee(Integer.parseInt(strarr[0]),strarr[1],strarr[2]);
				elist.add(e);
				str=bis.readLine();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("size: "+elist.size());
	}

	

}
