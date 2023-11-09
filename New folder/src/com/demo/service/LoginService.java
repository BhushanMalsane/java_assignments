package com.demo.service;
import java.util.HashMap;
import java.util.Map;

import com.demo.exception.WrongCredential;

public class LoginService {
	
	static Map<String,String> hm;
	
	static {
		
		hm = new HashMap<>();
		hm.put("user1","user1");
		hm.put("user2","user2");
		hm.put("user3","user3");
		
	}
	
	public static boolean Validateuser(String un,String pw) throws WrongCredential
	{
		String password = hm.get(un);
		if (pw.equals(password))
		{
			return true;
		}
		throw new WrongCredential("Credential are wrong");
	}

}
