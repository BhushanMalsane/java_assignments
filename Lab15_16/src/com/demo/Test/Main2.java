package com.demo.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("Textfile.txt");
					FileOutputStream fos = new FileOutputStream("textcopy.txt");){
			int x = fis.read();
			while(x!=-1) {
				fos.write(x);
				x = fis.read();
			}
			System.out.println("Data Overrided!!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
