package com.qa.temp;

import java.util.Scanner;

public class Doggo {

	public static void main(String[] args) {

		Scanner dog = new Scanner(System.in);

		System.out.println("Enter your dogs' position:");

		int position = dog.nextInt();

		for (int x = 1; 100 >= x; x++) {

			int y = (x % 10);

			if (x == position) {
				System.out.println("");
			}

			else if (x == 11) {
				System.out.println(x + "th");
			} else if (x == 12) {
				System.out.println(x + "th");
			} else if (x == 13) {
				System.out.println(x + "th");
			} else if (y == 1) {
				System.out.println(x + "st");
			} else if (y == 2) {
				System.out.println(x + "nd");
			} else if (y == 3) {
				System.out.println(x + "rd");
			} else {
				System.out.println(x + "th");
			}

		}

	}

}
