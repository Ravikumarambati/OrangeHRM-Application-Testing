package com.UserDefinedMethods;

public class MethodExample11 {

	//public static void main(String[] args) {

protected void division()
{
//Exception Handling
try
{

// Local Variables
	int var1=30;
	int var2=1;
	int var3;
	var3=var1/var2;
	System.out.println("The value of the variable var3 after Division is:-"+var3);
}
catch(Exception divisionException)
{
	System.out.println("The Exepection is:-"+divisionException);
}
}

public static void main(String[]args)
{

MethodExample11 m11=new MethodExample11();
m11.division();
		
			
	}

}
