package com.shristi.basic;
import java.util.Scanner;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter Array Size: ");
		 int arr=s.nextInt();
		 System.out.println("Enter the array elements:");
		  int a[]=new int[arr];
		  for(int i=0;i<arr;i++) {
			  a[i]=s.nextInt();
		  }
		  System.out.println("\nThe Duplicate Elements are:");
		  for(int i=0;i<arr;i++) {
			  for(int j=i+1;j<arr;j++) {
				  if(a[i]==a[j]) {
					  System.out.println(a[j]);
				  }
			  }
		  }
		  s.close();
		  

	}

}
