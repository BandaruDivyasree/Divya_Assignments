package com.shristi.basic;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int num=s.nextInt();
		int arr[]=new int[num];//declaring an array
		for(int i=0;i<num;i++) {
			//System.out.println("Enter Array Element:");
			arr[i]=s.nextInt();
		}

		System.out.println("Reverse Element Array:");
		for(int i=num-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		

	}

}
