package com.UserDefinedMethods;

public class MethodExample5 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	protected void division()
	{
	
		//Local Variables
		int var1=30;
		int var2=1;
		int var3;
		var3=var1/var2;
		
	System.out.println("The value of the variable var3 after Division is:-"+var3);	
	}
	
	public static void main(String[] args)
	{
	
	MethodExample5 m5=new MethodExample5();	
	System.out.println("*****Division Method of MethodExample5********");	
	
	m5.division();
	System.out.println();	
	
	
	}

}
