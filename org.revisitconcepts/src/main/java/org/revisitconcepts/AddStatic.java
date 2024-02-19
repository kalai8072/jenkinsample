package org.revisitconcepts;

public class AddStatic {
	// Non Static
	int a = 25;
	int b = 25;
	int c = a+b;
	
	//static
	
	static int num1 = 50;
	static int num2 = 60;
	static int num3 = num1+num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Non static
		AddStatic add1 = new AddStatic();
		int total = add1.c;
		System.out.println("Sum of two number is:"+total);
		
		//Static
		System.out.println("Sum of two value is:"+num3);
		
		

	}

}
