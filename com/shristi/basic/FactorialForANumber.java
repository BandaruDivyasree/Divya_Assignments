package com.shristi.basic;
import java.util.Scanner;

public class FactorialForANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Value:");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int factorial=1;
		int i;
		for(i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial:"+factorial);
		s.close();
		

	}

}
