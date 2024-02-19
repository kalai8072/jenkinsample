package superKeyword;

import net.bytebuddy.implementation.bind.annotation.Super;

class Animal {

	String color = "white"; // Parent Class variable

	void eat() {

		System.out.println("eating...."); // Parent class method

	}
}

class dog extends Animal {

	String color = "black";

	void displayColor() {

		System.out.println(super.color); //immediate parent (o/p will be "White")
	}

	void eat() {
		
		System.out.println("eating bread...");

		super.eat(); // immediate parent (o/p will be "eating....")
	}
}

public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog obj = new dog();
		obj.displayColor();
		obj.eat();

	}

}
