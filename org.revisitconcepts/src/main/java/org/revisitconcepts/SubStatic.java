package org.revisitconcepts;

public class SubStatic {
	//Non static
	int x,y,z;

	 //Static
	 static int a=100,b=65,c=a-b;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Non Static
		SubStatic sub1 = new SubStatic();
		sub1.x=50;
		sub1.y=20;
		int value = sub1.z;
		value = sub1.x-sub1.y;
		
		System.out.println("Sub of two number is:"+value);
		
		//Static
		
		System.out.println("Sub of two value is:"+c);
		
		/*SubStatic obj = new SubStatic();
		System.out.println(obj.c);*/

	}

}
