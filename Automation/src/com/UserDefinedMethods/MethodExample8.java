package com.UserDefinedMethods;

public class MethodExample8 {

	//public static void main(String[] args) {
		
//Method names should be always Unique
		public void addition()
		{
		// Local Variables
			int var1=30;
			int var2=50;
			int var3;
			var3=var1+var2;
			System.out.println("The value of the variable va3 after Addition is:-"+var3);
		}
		
		//Global Variables
		int var1=60;
		int var2=90;
		
		public void subtraction()
		{
		
			//int var1;
			//int var2;
			int var3;
		var3=var1-var2;
		System.out.println("The value of the variable var3 after subtraction is:-"+var3);
		}
		
		public static void main(String[] args)
{

			MethodExample8 m8=new MethodExample8();
			m8.addition();
			m8.subtraction();
			
	}

}
