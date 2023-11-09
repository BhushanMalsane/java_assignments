package com.demo.test;
import com.demo.beans.Person;

import java.util.ArrayList;
import java.util.Iterator;
public class PersonList {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		ArrayList<Person> plist = new ArrayList<>();
		plist.add(new Person(1,"Bhushan","123"));
		plist.add(new Person(2,"Akshay","456"));
		plist.add(new Person(2,"Harsh","494"));
		plist.add(new Person(4,"Shubh","753"));
		
//	for(Person e: plist)
//	{
//		System.out.println(e);
//		System.out.println("-------------------------");
//	}
	
//		for(int i=0;i<plist.size();i++)
//		{
//			System.out.println(plist.get(i));
//		}
	
		
		  plist.remove(new Person(2,null,null));
	
		
		for(Person e: plist)
		{
			System.out.println(e);
			System.out.println("-------------------------");
		}
		
		

}
}
