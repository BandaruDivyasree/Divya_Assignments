package com.shristi.basic;
import java.util.Scanner;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value");
		int value=s.nextInt();
		for(int i=0;i<value;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
