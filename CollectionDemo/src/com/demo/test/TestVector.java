package com.demo.test;
import java.util.*;

public class TestVector {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(50,10);
		v1.add(5);
		v1.add(10);
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter no");
			int num = sc.nextInt();
			v1.add(num);
		}
		
//		for(Integer in:v1)
//		{
//			System.out.println(in);
//		}
//		
		
		v1.stream().forEach(System.out::println);
	}
	
	

}
