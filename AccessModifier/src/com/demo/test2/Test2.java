package com.demo.test2;

import com.demo.test1.Test1;

public class Test2  extends Test1{

	public static void main(String[] args) {
		
		System.out.println("Display ====");
		System.out.println("PUBLIC VARIABLE   " + Test1.counter1);
		
		System.out.println("PROTECTED VARIABLE   " + Test1.counter2);
		
	   System.out.println("Private Variable    " + Test1.getCounter3());
	  
	   Test1.displayPublic();
	   Test1.displayProtected();
	   
	 
	   
       
	}
	
	
}
