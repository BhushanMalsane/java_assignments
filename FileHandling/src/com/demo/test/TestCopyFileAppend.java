package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFileAppend {
	
	public static void main(String[] args) {
		
		FileOutputStream fo = null;
		File f = new File("testfile.txt");
		
		try
		{
			if(f.exists())
			{
				fo = new FileOutputStream("testcopy.txt",true);
			}
			
			else
			{
				fo = new FileOutputStream("testcopy.txt");
				
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		try(FileInputStream fin = new FileInputStream("testfile.txt"); 
				FileOutputStream fo1 = fo;)
		{
		   int x = fin.read();
		   
		   while(x != -1)
		   {
			   fo1.write(x);
			   x = fin.read();
			   System.out.print((char)x);
		   }
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error Occured");

		}
		catch (IOException e) {
			// TODO: handle exception
		System.out.println("I/O Exception");
		}
		
	}

}
