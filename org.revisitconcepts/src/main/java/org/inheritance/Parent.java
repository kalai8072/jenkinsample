package org.inheritance;

//Hierarchy Inheritance

public class Parent {
	
	
	
	public void display(int a) {
		
		System.out.println(a);
	}
	
	class child1 extends Parent {
		
		public void show(int b) {
			
			System.out.println(b);
		}
		
		
	
	
	class child2 extends Parent {
		
		public void print (int c)	{
			
			System.out.println(c);
			
		}
		
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 obj1 = new child1();
		obj1.display(100);
		obj1.show(200);
		
		child2 obj2 = new child2();
		obj2.display(200);
		obj2.print(400);

	}

	}
}
