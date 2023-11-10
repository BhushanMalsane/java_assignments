package com.demo.dao;
import java.util.List;
import java.util.ArrayList;

import com.demo.beans.*;

public class TeamServiceDaoImpl implements TeamserviceDao 
{
	List<Teams> tArr = new ArrayList<>(); 
	
	tArr.add((1,"csk","Rahul_Dravid",pList.add("dhoni",7,"Batsman"));
	@Override
	public void saveTeam(Teams t) {
		tArr.add(t);	
	}
	@Override
	public void findAll() {
		System.out.println(tArr);
		
	}

     
	
	
}
