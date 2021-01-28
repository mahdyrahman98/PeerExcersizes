package com.qa.week3.gen;

import java.util.Scanner;

public class Runners {

	public static void main(String[] args) {

		Scanner factorial = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = factorial.nextInt();

		int m = number;

		for (int x = 2; m != x; x++) {
			m = m / x;
			
		}
		
		if( m != 0)
		{

		System.out.println("Reverse factorial of " + number + " is " + m + "!");
		}
		else {
			
			System.out.println("Reverse factorial of " + number + " is none " );
		}

	 {
			
			
			
		}
	}
}


