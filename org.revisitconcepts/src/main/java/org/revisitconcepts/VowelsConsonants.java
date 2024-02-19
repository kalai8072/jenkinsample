package org.revisitconcepts;

import java.util.Scanner;

public class VowelsConsonants {
	
	/* to check vowel o consonant: 1. get the letter from the user using scanner class
	 * use if else statement: if letter is equal to "a, e, i, o,u " then given letter is vowel
	 * otherwise given letter is consonant */
	
	/*//get input from the user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the letter: ");
	char letter = sc.next().charAt(0); 
	
	//if letter is equal to "a, e, i, o,u " then given letter is vowel
	if(letter == 'a' || letter == 'e' || letter == 'i' ||
			letter == 'o' || letter == 'u') {
		
		System.out.println("given letter is vowel");

	}
	else {
		
		System.out.println("given letter is consonant");
	}
	sc.close();
}
}*/

	
	static String vowels = ("a,e,i,o,u");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter the letter: ");
		  String letter = sc.next();
		
		if(vowels.equalsIgnoreCase(letter)) {
			System.out.println("This is vowels");
		}
			
			else {
				System.out.println("This is consonants");
			}
			sc.close();
	}
}
		
		

	

