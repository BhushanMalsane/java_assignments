package com.demo.test1;

public class Test1 {

static public int  counter1;
static protected int  counter2;

static private int  counter3;


	
static {	
 counter1 = 10;
 counter2 = 20;
 counter3 = 30;

}

public static void  displayPublic()
{
System.out.println("In Display Public");	
}


protected static void displayProtected()  
{  
    System.out.println("In Display Protected");  
}  

private static void displayPrivate()
{
System.out.println("In Display Private");
}


public int getCounter1() {
	return counter1;
}

public int getCounter2() {
	return counter2;
}

public static int getCounter3() {
	int x  = counter3;
	return x;
}




}
