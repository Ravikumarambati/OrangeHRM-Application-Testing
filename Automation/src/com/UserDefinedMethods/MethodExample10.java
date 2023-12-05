package com.UserDefinedMethods;

public class MethodExample10 {

	public static void main(String[] args) {

MethodExample2 m2=new MethodExample2();
System.out.println("******Addition Method of MethodExample2*******");

m2.addition(); //public method
System.out.println("******Subtraction Method of MethodExample3*****");

m2.subtraction(); //public method
System.out.println();

MethodExample3 m3=new MethodExample3();
System.out.println("******Multiplication Method of MethodExample3*****");

/*
MethodExample5 m5=new MethodExample5();
System.out.println("*******Division MethodExample5*************");		

m5.division(); //protected Method		
System.out.println();
*/

MethodExample11 m11=new MethodExample11();
System.out.println("*********Division Method of MethodExample");
m11.division();
System.out.println();
		
MethodExample6 m6=new MethodExample6();
System.out.println("*********Addition Method of MethodExample6");
m6.addition(); //default
System.out.println();
		
		

		
	}

}
