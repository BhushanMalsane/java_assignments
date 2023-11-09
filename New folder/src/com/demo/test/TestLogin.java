package com.demo.test;
import java.util.*;

import com.demo.exception.WrongCredential;
import com.demo.exceptions.BlockAccountException;
import com.demo.service.LoginService;


public class TestLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			for(int i=0; i<3; i++)
				
		{		
		
		try
		{
			String Uname;
			String Pwd;
			System.out.println("Enter usename");
			Uname = sc.nextLine();
			System.out.println("Enter Password");
			Pwd = sc.nextLine();
			
			boolean status = LoginService.Validateuser(Uname, Pwd);
			if(status)
			{
				System.out.println("Login Successful");
			}
		}
		
		catch(WrongCredential e)
		{
			System.out.println(e.getMessage());
		}
		if(i==2)
		{
			throw new BlockAccountException("Your account is blocked, pls contact admin ");
		}
		
		}
	 }
		catch(BlockAccountException e )
		{
			System.out.println(e.getMessage());
		}
	}

}