package com.UserDefinedMethods;

public class MethodExample1 {
	

	//User defined Methods are created for Re-Usability Purpose	
	
		//User Defined Method
		//User defined methods can be created either Above the Main Method OR below the Main method
		//User defined Methods should never be created within the Main Method
	
		public void srinivas()
		{
			System.out.println("Srinivas is a Performance Test Manager");
		}
		public static void main(String[]args)
		{
		//The execution Process always starts from the Main method
		//Creating an Object for the Current Class	
		
			MethodExample1 hello=new MethodExample1();
		    hello.srinivas(); //using the Object-calling the User defined Method
		    System.out.println();
		    
		    //MethodExample1 test=new MethodExample1();
		    //test.srinivas();
		    
		    //it is not Mandatory to create a new object always to call different User defined methods
		    hello.srinivas(); //using the existing Object calling another user defined method
		System.out.println();
		
		hello.srinivas();
		}
		
		public void srini()
		
		{		
		System.out.println("The is My User Defined Metho");
		System.out.println("Srini is Functional Automation Test Lead");
	}

}
