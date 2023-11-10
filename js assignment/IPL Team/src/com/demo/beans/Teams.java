package com.demo.beans;

import java.util.Arrays;
import java.util.List;

public class Teams {
private int teamId;
private String teamName;
private String coachName;
private List<Players> pList;


public Teams() {
	teamId=0;
	teamName=null;
	coachName=null;
}


public Teams(int teamId, String teamName, String coachName,List<Players> pList) {
	super();
	this.teamId = teamId;
	this.teamName = teamName;
	this.coachName = coachName;
	this.pList=pList;
	
}


public int getTeamId() {
	return teamId;
}


public void setTeamId(int teamId) {
	this.teamId = teamId;
}


public String getTeamName() {
	return teamName;
}


public void setTeamName(String teamName) {
	this.teamName = teamName;
}


public String getCoachName() {
	return coachName;
}


public void setCoachName(String coachName) {
	this.coachName = coachName;
}


@Override
public String toString() {
	return "Teams [teamId=" + teamId + ", teamName=" + teamName + ", coachName=" + coachName + ", pList=" + pList + "]";
}






}
