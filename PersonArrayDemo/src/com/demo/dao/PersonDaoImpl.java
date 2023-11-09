package com.demo.dao;

import com.demo.beans.Person;

public class PersonDaoImpl implements PersonDao {

	
	static Person [] parr ;
	static private int cnt;
	
	static
	{
		parr = new Person[20];
		parr[0]=new Person(1,"xxx","33333");
		parr[1]=new Person(2,"yyy","44444");
		cnt=2; 
	}
	
	
	@Override
	public void save(Person P) {
		// TODO Auto-generated method stub
		parr[cnt] = P;
		cnt++;
		
	}
	
	
	

}
