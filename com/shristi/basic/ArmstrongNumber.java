package com.shristi.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Value");
		int value,sum=0;
		value=s.nextInt();
		String value_string=Integer.toString(value);
		int value_of_digits=value_string.length();
		int given_value=value;
		while(given_value!=0) {
			int remainder=given_value % 10;
			sum+=Math.pow(remainder, value_of_digits);
			given_value/=10;
		}
		//System.out.println(sum);
		if(value==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}

	}

}
