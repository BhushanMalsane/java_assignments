package com.demo.test;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputString {

	public static void main(String[] args) {
		
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("testfile.txt")); 
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("textcopyfile.txt"));
						)
		{
			String  x = dis.readLine();
			while(x != null )
			{
				System.out.println(x);
				 x = dis.readLine();
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error occur");
		}
		catch (IOException e) {
			// TODO: handle exception
		System.out.println("IO exception");
		}
	}
}
