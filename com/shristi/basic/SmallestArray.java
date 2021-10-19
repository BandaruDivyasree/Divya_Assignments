package com.shristi.basic;

import java.util.Scanner;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter Values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int smallestValue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(smallestValue>arr[i]) {
				smallestValue=arr[i];
			}
		}
		System.out.println("SmallestValue:"+smallestValue);
		s.close();
		
		

	}

}

