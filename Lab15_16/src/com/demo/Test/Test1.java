package com.demo.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Date dt =new Date();
		System.out.println(dt);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(sdf.format(dt));
		// String to date conversion
		System.out.println("enter date");
		String d1=sc.next();
		try {
			Date dt1 = sdf.parse(d1);
			System.out.println(dt1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		LocalDate dt2 = LocalDate.parse(d1,DateTimeFormatter.ofPattern("dd/mm/yyy"));
	System.out.println(dt2);
	System.out.println(dt2.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")));
	System.out.println("Year:"+ dt2.getYear());
	}
	
	
}
