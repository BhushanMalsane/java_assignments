package com.demo.test;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import java.util.List;
import java.util.Scanner;



public class TestArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary\n");
		System.out.println("4. Display all\n5. display by id\n 6. sort by salary\n7. sort by name\n8.exit\n choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. salaried\n2.contract\n 3.vendor");
			int ch=sc.nextInt();
			eservice.addnewEmployee(ch);
			break;
		
		default:
			System.out.println("wrong choice");
		}
		}while(choice!=8);
	}

}