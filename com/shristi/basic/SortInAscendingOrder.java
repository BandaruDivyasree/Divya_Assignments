package com.shristi.basic;
import java.util.Scanner;
public class SortInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Elements in array:");
		int arr=s.nextInt();
		int a[]=new int[arr];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The Array Elements are:");
		for(int i=0;i<arr;i++) {
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nThe sorted Array:");
		for(int i=0;i<arr;i++) {
			System.out.println(a[i]+" ");
		}
		s.close();
		

	}

}
