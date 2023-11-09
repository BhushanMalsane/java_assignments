package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Autoclose {

	public static void main(String[] args)  {
		//if you declare this in try block then fis will not work in finally block
		
		try(FileInputStream fis = new FileInputStream("testfile.txt");
				FileOutputStream fos = new FileOutputStream("testcopy.txt");) {
			 
			int x = fis.read();
			while(x!= -1)
			{
				fos.write(x);
			//	System.out.println(x);
				char c = (char)x;
				System.out.print(c);
				x = fis.read();
				
			}
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error occoured");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("I/O error");
		}
		
		
			
		
		
		
	}
}
