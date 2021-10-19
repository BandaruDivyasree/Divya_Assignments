package com.shristi.basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.util.Scanner;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value");
		int input = scan.nextInt();
		int sum = 0;
		for (int i = 1; i < input; i++) {
			if (input % i == 0) {
				sum=sum + i;
			}

		}
		if (sum == input) {

			System.out.println("perfect number");
		} else {
			System.out.println("Not a perfect number");
		}

		scan.close();
	}

}


