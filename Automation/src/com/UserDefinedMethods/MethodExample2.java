package com.UserDefinedMethods;

public class MethodExample2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

//Method names should be always Unique		
 public void addition()
 {
		
	//Local Variables
	
	 int var1=30;
	 int var2=50;
	 int var3;
	 var3=var1+var2;
	  
	 System.out.println("The value of the variable var3 after Addition is:-"+var3);
 }
public void subtraction() {
		// TODO Auto-generated method stub
		
			
int var1=30;
int var2=50;
int var3;

var3=var1-var2;

System.out.println("The value of the variable var3 after Subtraction is:-"+var3);

		
	}
 public void multiplication() {
	 
	 int var1=30;
	 int var2=50;
	 int var3;
	 
	 var3=var1*var2;
	 
	 System.out.println("The value of the variale var3 after Multiplicationis:-"+var3);
 }


 public static void main(String[]args)
 {
MethodExample2 m2=new MethodExample2();		
m2.addition();

System.out.println();
m2.subtraction();

m2.multiplication();
 }	
	

}
