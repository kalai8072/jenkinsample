package org.revisitconcepts;

public class MulStatic {
	
	//Non static 
	int a = 25;
	int b = 25;
	int c = a*b;
	
	//static
	
	static int x,y,z;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Non static
		
		MulStatic mul1 = new MulStatic();
		int value = mul1.c;
		
		System.out.println("Mul of two number is:"+value);
		
		//static
		
		x=20;y=20;z=x*y;
		System.out.println("Mul of two value is:"+z);

	}

}
