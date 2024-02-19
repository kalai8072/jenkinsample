package org.inheritance;



//Single Inheritance

public class A {
	
int a = 100;
	
	public void display() {
		
		System.out.println(a);
	}
	
}
	
	class B extends A {
		
		int b = 200;
		
		public void show() {
			
			System.out.println(b);
		}
		
		
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B bobj = new B ();
		bobj.display();
		bobj.show();
		
		
	}
	
	}


