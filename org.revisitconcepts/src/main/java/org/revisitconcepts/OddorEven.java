package org.revisitconcepts;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* to check even or odd: number divisible by 2 is even
		   * using scanner class get the input from the user
		   * use modulus operator to check the remainder; if 0 given number is even otherwise it is odd */
		  
		  //get input from the user
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the number: ");
		  int num = sc.nextInt();
		  
		  
		  //check even or odd
		  
		  if(num%2 == 0) {
		   System.out.println("It is even number");
		  }
		  else {
		   System.out.println("It is odd number");
		  }
		  sc.close();
	}

}
