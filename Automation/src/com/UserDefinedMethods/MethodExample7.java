package com.UserDefinedMethods;

public class MethodExample7 {

	
	//* It is not mandatory to have at least One User-Defined method to perform Operations
	//of calling User Defined Methods of Other Different Classes
	
	public static void main(String[] args) {
		
	MethodExample2 m2=new MethodExample2();
	System.out.println("******Addition Method of MethodExample2*******");
    
	m2.addition(); //public method
	System.out.println("*******Subtraction Method of MethodExample2****");
	
	m2.subtraction(); //public method
	System.out.println();
	
	MethodExample3 m3=new MethodExample3();
	System.out.println("****Multiplication Method od MethodExample2*******");	

//  Multiplication Method is a Private Method--the Private methods cannot be accessed
//  from other different class
// 	Private Methods can be accessed in the same Class in which they are Created and
//  Can be accessed for any number of times within the class
		
	MethodExample5 m5=new MethodExample5();
	System.out.println("******Division Method of MethodExample5**************");
	m5.division(); //protected Method
	System.out.println();
	
	MethodExample6 m6= new MethodExample6();
	System.out.println("*********** Addition Method of MethodExample6********");	
	m6.addition();
	System.out.println();
			
	}

}
