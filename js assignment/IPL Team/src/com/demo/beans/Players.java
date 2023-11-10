package com.demo.beans;

public class Players extends Teams {
private String pName;
private int pNo;
private String pSkill;



public Players(String pName, int pNo, String pSkill) {
	super();
	this.pName = pName;
	this.pNo = pNo;
	this.pSkill = pSkill;
}


public Players() {
	pName=null;
	pNo=0;
	pSkill=null;
}


@Override
public String toString() {
	return "Players [pName=" + pName + ", pNo=" + pNo + ", pSkill=" + pSkill + "]";
}





public String getpName() {
	return pName;
}


public void setpName(String pName) {
	this.pName = pName;
}


public int getpNo() {
	return pNo;
}


public void setpNo(int pNo) {
	this.pNo = pNo;
}


public String getpSkill() {
	return pSkill;
}


public void setpSkill(String pSkill) {
	this.pSkill = pSkill;
}







}
