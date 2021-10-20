package com.shristi.basic;
import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,remainder,reverse=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		number=s.nextInt();
		while(number!=0) {
			remainder=number%10;
			reverse=(reverse*10)+remainder;
			number=number/10;
		}
		System.out.println("Reverse Number is:"+reverse);
	}
}
		
		
		
