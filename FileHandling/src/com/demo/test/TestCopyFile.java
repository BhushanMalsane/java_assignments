package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {

	public static void main(String[] args)  {
		//if you declare this in try block then fis will not work in finally block
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			 fis = new FileInputStream("testfile.txt");
			 fos = new FileOutputStream("testcopy.txt");
			int x = fis.read();
			while(x!= -1)
			{
				fos.write(x);
			//	System.out.println(x);
				//char c = (char)x;
				//System.out.print(c);
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
		finally
		{
			try
			{fis.close();
			fos.close();
			}
			catch(IOException e)
			{System.out.println("I/O Error");
				
			}
       }
		
			
		
		
		
	}
}
