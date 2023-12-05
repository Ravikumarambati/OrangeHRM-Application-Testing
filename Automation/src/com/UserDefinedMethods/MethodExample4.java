package com.UserDefinedMethods;

public class MethodExample4 {

	//public static void main(String[] args) {
	
		private void division() {
        //Local Variables
		int var1=30;
		int var2=1;
		int var3;
		var3=var1/var2;
		
		System.out.println("The value of the variable vare after Division is :-"+var3);
	}
    	public static void main (String[] args) {
	
		MethodExample2 m2=new MethodExample2();
		System.out.println("*******Addition Method of MethodExample2*******");
		
		m2.addition();
		System.out.println("*******Subtraction MethodExample2*********");
		
		m2.subtraction();
		System.out.println();
		
		MethodExample3 m3=new MethodExample3();
		System.out.println("*******Muliplication Method of MethodExample3******");
		
		//Multiplication Method is a Private Method --the Private methods cannot be accessed
		//from other different class
		
		//Private Methods can be accessed in the same Class in which they are Created and
		//can be accessed for any number of times within the class
		
		MethodExample4 m4=new MethodExample4();
		m4.division();
		
		System.out.println();
	
	}

}
