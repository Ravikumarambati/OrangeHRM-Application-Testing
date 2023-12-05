package com.UserDefinedMethods;

public class MethodExample6 {

	void addition() //Default Method
	
	{
	//Local Variables
		int var1=30;
		int var2=50;
		int var3;
		var3=var1+var2;
		
		System.out.println("The value of the variable var3 after Addition is:-"+var3);
	}
	//public static void main(String[] args) {
	{

	MethodExample5 m5=new MethodExample5();
	System.out.println("*****Division MetodExample5********");
	m5.division();
	
	System.out.println();
		
	MethodExample6 m6=new MethodExample6();
	System.out.println("*******Addition Method of MetodExample6****");
	m6.addition();
	System.out.println();	
		
		
	}	
		
	
	}