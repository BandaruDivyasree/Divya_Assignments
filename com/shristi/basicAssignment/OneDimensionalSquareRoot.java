package com.shristi.basicAssignment;
import java.util.Scanner;

public class OneDimensionalSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array size");
		Scanner s=new Scanner(System.in);
		int arrSize=s.nextInt();
		
		int arr[]=new int[arrSize];
		System.out.println("Enter the values:");
		for(int i=0;i<arrSize;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Square root is:");
		for(int number:arr) {
			System.out.println(Math.sqrt(number));
		}
		s.close();

	}

}
