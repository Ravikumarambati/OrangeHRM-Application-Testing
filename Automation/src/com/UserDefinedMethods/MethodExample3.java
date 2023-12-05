package com.UserDefinedMethods;

public class MethodExample3 {

private void multiplication() {
	// Local Variables
		int var1=30;
		int var2=50;
		int var3;
		var3=var1*var2;
		System.out.println("The value of the variable var3 after Maultiplication is:-"+var3);
	}	
		
	public static void main(String[] args){
	
		MethodExample3 m3=new MethodExample3();
	System.out.println("*****Multiplication Method of MethodExample3****");	
		m3.multiplication();
		m3.multiplication();

		
		
		//Multiplication method is a Private Method -- the Private methods cannot be accessed
		
		//from other different class
		//Private Methods can be accessed in the same Class in which they are Created and
		// can be accessed for any number of times within the class
		
		//m3.addition();
		
		//MethodExample2 class Addition user defined Method is required in MehtodExaple3
		
	//Creating an Object for Another Class in the Current Class which contains Addition Method
		MethodExample2 m2=new MethodExample2();
		
	System.out.println("*******Addition Method of MethodExample2*****");	
 m2.addition();
				
	}
		

}
