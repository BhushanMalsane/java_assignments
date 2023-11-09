package com.demo.Test;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.Beans.Employee;
import com.demo.Service.ServIf;
import com.demo.Service.ServImp;

public class Main1 {
	public static void main(String[] args) {
		ServIf sf = new ServImp();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Enter Choice \n 1.Add Employee \n 2.Delete by id  Employee \n 3. Display all \n 4.Exit \n");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				sf.addEmp();
				break ;
			case 2:
				System.out.println("Enter ID");
				int id = sc.nextInt();
				boolean status = sf.deleteId(id);
				if(status) {
					System.out.println("Success");
				}
				else {
					System.out.println("ID not found");
				}
				break;
			case 3:
				ArrayList<Employee> elist =sf.displayAll();
				elist.stream().forEach(System.out::println);
				break;
			case 4:
				break;
			}
		}while(choice!=4);
	}
}
