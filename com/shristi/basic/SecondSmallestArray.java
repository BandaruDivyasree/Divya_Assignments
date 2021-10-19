package com.shristi.basic;
import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		
		int[] array=new int[number];
		System.out.println("Enter Values");
		for (int i=0;i<number;i++) {
			array[i]=sc.nextInt();
			
			
		}
		
		Arrays.sort(array);
		/*
		 * for (int n:array) { System.out.println(n); }
		 */		System.out.println(array[1]);
		

	}

}
