package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.demo.beans.Student;
import com.demo.dao.*;


public class StudentServiceImpl implements StudentService {
	private StudentDao sd;
	public StudentServiceImpl() {
		sd=new StudentDaoImpl();
	}
	

	@Override
	public void createStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id :");
		int sid=sc.nextInt();
		System.out.println("Enter student name :");
		String name=sc.next();
		System.out.println("Enter dob :");
		String dob = sc.next();
		LocalDate dt= LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter degree :");
		String deg=sc.nextLine();
		System.out.println("Enter degree marks :");
		double marks = sc.nextDouble();
		
		Student s=new Student(sid,name,dt,deg,marks);
		
		
		
		
	}

}
