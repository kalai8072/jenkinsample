package org.inheritance;


//Multilevel inheritance

public class ClassA {

	int a;

	public void display() {

		System.out.println(a);
	}
	


	public class ClassB extends ClassA {

		int b;

		public void show() {

			System.out.println(b);
		}
		
	
		public class ClassC extends ClassB {

			int c;

			public void print() {

				System.out.println(c);
			}
		
	
			
			public void main(String[] args) {
				
				ClassC obj1 = new ClassC();
				obj1.a=100;
				obj1.b=200;
				obj1.c=300;
				
				obj1.display();
				obj1.show();
				obj1.print();
				
				
				
			}
		
	}
		
	}
	
}


