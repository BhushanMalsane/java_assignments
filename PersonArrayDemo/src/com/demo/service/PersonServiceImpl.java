package com.demo.service;
import java.util.*;

import com.demo.beans.Person;
import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoImpl;
import com.demo.service.*;


public class PersonServiceImpl implements PersonService {

	private PersonDao pdao;
	
	public PersonServiceImpl()
	{
		pdao = new PersonDaoImpl();
	}
	
	@Override
	public void addNewPerson() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		
		Person P = new Person(pid,nm,mob);
		
		pdao.save(P);
	}

}
