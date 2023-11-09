package com.demo.test;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeMain {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	
	int ch=0;
	EmployeeService earr=new EmployeeServiceImpl();
	do {
		System.out.println("1.add\n2.sorting using comparable on Name\n3.sorting using comparator on ID\n4.Exit");
		System.out.println("Enter the choice");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Adding the new employee");
			earr.addEmployee();
			break;
		case 2:
			
			earr.sort(null);
			break;
		case 3:
			earr.sorting();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
		
	}while(ch!=4);
}
}