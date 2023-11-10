package com.demo.service;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.*;
import java.util.List;
import java.util.ArrayList;
public class TeamsServiceImpl 
{
List<Players> pList= new ArrayList<>();
private TeamserviceDao td;
public TeamsServiceImpl() {
	td=new TeamServiceDaoImpl();
}

   public void createTeam()
   {
	   String pName=null;
	   int pNo=0;
	   String skill=null;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Team name :");
	   String tName=sc.nextLine();
	   System.out.println("Enter Team id :");
	   int tId=sc.nextInt();
	   sc.nextLine();
	   System.out.println("Enter coach name :");
	   String coach=sc.nextLine();
	   System.out.println("Enter no of players :");
	   int no = sc.nextInt();
	   sc.nextLine();
	   for(int i=0;i<no;i++)
	   {
		   System.out.println("Enter Player name :");
		   pName=sc.nextLine();
		   System.out.println("Enter Player no :");
		   pNo=sc.nextInt();
		   sc.nextLine();
		   System.out.println("Enter player skill :");
		   skill = sc.nextLine();
		   pList.add(new Players(pName,pNo,skill));
	   }
	   Teams t = new Teams(tId,tName,coach,pList);
	   td.saveTeam(t);
        
	   
	   
   }
   
   public void displayAll()
   {
	   td.findAll();
   }
}
