package com.demo.test;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferReader {
	 public static void main(String args[])throws Exception{    
         FileReader fr=new FileReader("testfile.txt");    
         BufferedReader br=new BufferedReader(fr);    
 
         int i;    
         while((i=br.read())!=-1){  
         System.out.println((char)i);  
         }  
         br.close();    
         fr.close();    
   }    
}
