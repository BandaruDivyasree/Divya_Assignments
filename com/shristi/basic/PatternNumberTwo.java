package com.shristi.basic;
import java.util.Scanner;

public class PatternNumberTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Value:");
		Scanner s=new Scanner(System.in);

		int number=s.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" "+i);
			}
			System.out.println(" ");
		}
		s.close();

	}

}
