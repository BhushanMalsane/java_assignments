
package com.demo.test;
import java.util.*;
public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lst=new ArrayList<>(50);
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter no");
			int num=sc.nextInt();
			lst.add(num);
		}
		System.out.println(lst.get(2));
		
		int sum=0;
		for(Integer o:lst)
		{
			sum=sum+o;
			
		}
		System.out.println("sum =" +sum);
		
		System.out.println("enetr the number for deletetion");
		int num=sc.nextInt();
		
//		Iterator<Integer> it=lst.iterator();
//		while (it.hasNext())
//		{
//			if( num==it.next())
//			{
//				it.remove();
//			}
//				
//					
//		}
//		System.out.println(lst);
		
		lst.remove(new Integer(num));
		System.out.println(lst);
		

	}

}
