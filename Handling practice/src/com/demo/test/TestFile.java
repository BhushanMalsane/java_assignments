package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestFile {
	public static void main(String[] args)  {
		FileInputStream fis =new FileInputStream("testfile.txt");
		FileOutputStream fos = new FileOutputStream("testcopyfile.txt");
		
		int x = fis.read();
		try
		{
			while(x!=-1)
			{
				fos.write(x);
				x = fis.read();
			}
		}
		catch(FileNotFoundException)
	}

}
